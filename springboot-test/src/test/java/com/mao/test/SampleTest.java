package com.mao.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mao.test.mapper.UserMapper;
import com.mao.test.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author mao
 * @createTime 2022/12/11 20:37
 * @Description: 测试类
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SampleTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        Page<User> page = new Page<>(1,3);
        userMapper.selectPage(page, null);
        page.getRecords().forEach(System.out::println);
    }

    @Test
    public void testdelete() {
        int count = userMapper.deleteById(5);
        System.out.println(count);
    }

    @Test
    public void testUpdate() {
        System.out.println(("----- update method test ------"));
        User user = new User();
        user.setId(6);
        user.setName("张三");
        user.setAge(20);
        user.setEmail("123456@qq.com");
        int count = userMapper.updateById(user);
        System.out.println(count);
    }

    @Test
    public void testVersion() {
        User user = userMapper.selectById(2);
        user.setName("李四");
        user.setAge(20);
        user.setEmail("987654@qq.com");

        // 还没有修改，插队操作
        User user1 = userMapper.selectById(2);
        user1.setName("王五");
        user1.setAge(18);
        user1.setEmail("000000@qq.com");
        userMapper.updateById(user1);

        userMapper.updateById(user);
    }

    @Test
    public void testWrapper() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.inSql("id","select id from user where id<3");
        userMapper.selectList(wrapper).forEach(System.out::println);
    }
}
