package cn.objectspace.webssh.pojo;

import lombok.Data;

@Data
public final class User {
    private Integer id;
    private String username;
    private String password;
    private static User user = null;
//    private User(){};
    public static User getInstance(){
        if(null == user){// 当 instance 为 null 时，则实例化对象，否则直接返回对象
            user = new User();// 实例化对象
        }
        return user;// 返回已存在的对象
    }
}
