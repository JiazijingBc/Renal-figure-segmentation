package cn.objectspace.webssh.service.impl;

import cn.objectspace.webssh.mapper.UserMapper;
import cn.objectspace.webssh.pojo.User;
import cn.objectspace.webssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User checkIn(String username, String password) {
        return userMapper.checkIn(username,password);
    }
}
