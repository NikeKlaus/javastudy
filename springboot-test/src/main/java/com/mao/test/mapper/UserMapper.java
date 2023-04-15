package com.mao.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mao.test.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author mao
 * @createTime 2022/12/11 20:36
 * @Description: UserDao层
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from user where name like #{name}")
    @Select("select * from user where name like concat('%',#{name},'%')")
    List<User> query(String name);
}