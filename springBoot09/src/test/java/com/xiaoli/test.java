package com.xiaoli;


import com.xiaoli.entity.Entity;
import com.xiaoli.entityRepository.EntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class test {

    @Autowired
    EntityRepository repositor;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test(){
        List<Entity> all = repositor.findAll();

        redisTemplate.boundHashOps("xiao").put("name","xiaoli");

        String o = (String) redisTemplate.boundHashOps("xiao").get("name");
        System.out.println(o);
        System.out.println("xiaolijiushizhemeshuai1");
        System.out.println(all);
    }

    @Test
    @Scheduled(cron ="0/3 * * * * *" )
    public void test22(){
        System.out.println("hello");
    }
}
