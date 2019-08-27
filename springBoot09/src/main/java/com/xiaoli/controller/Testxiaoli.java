package com.xiaoli.controller;


import com.xiaoli.UserMapper2.UserMapper;
import com.xiaoli.entity.Entity;
import com.xiaoli.entity.User;
import com.xiaoli.entityRepository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Testxiaoli {

    @Autowired
    UserMapper userMapper;

    @Autowired
    EntityRepository entityRepository;
    @RequestMapping("test")
    public String getAll(){
        List<User> all = userMapper.findAll();
        System.out.println(all);

        List<Entity> all1 = entityRepository.findAll();
        System.out.println(all1);
        return "jiushizhemediao1";
    }
}
