package com.igeek.ch03.mapper;

import com.igeek.pojo.User;

import java.util.List;

public interface UserMapper {

    //通过id查询用户信息
    public User findOne(Integer id);

    //根据用户名进行模糊查询用户信息
    public List<User> findByName(String username);

    //插入用户信息
    public void insert(User user);

    //更新用户信息
    public void updateUser(User id);

    public void deleteUser(Integer id);
}
