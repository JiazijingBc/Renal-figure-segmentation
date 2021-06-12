package cn.objectspace.webssh.service;

import cn.objectspace.webssh.pojo.User;

public interface UserService {
    User checkIn(String username, String password);
}
