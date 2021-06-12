package cn.objectspace.webssh.mapper;

import cn.objectspace.webssh.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User checkIn(String username,String password);
}
