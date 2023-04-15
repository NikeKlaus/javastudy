package com.mao.test.controller;

import com.mao.test.mapper.UserMapper;
import com.mao.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mao
 * @createTime 2023/2/1 10:47
 * @Description: 用户 Controller
 */
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping({"/","/list"})
    public List<User> list(){
        return userMapper.selectList(null);
    }

    @RequestMapping("/query")
    public List<User> query(String name){
        return userMapper.query(name);
//        return userMapper.query("%"+name+"%");
    }

    @RequestMapping("/insert")
    public String insert(String name,Integer age){
        return userMapper.insert(new User(name,age)) > 0 ? "success!" : "fail!";
    }
}
