package com.xiaoli.UserMapper2;

import com.xiaoli.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    public List<User> findAll();
}
