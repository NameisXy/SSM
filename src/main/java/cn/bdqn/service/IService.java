package cn.bdqn.service;

import cn.bdqn.bean.User;

import java.util.List;

public interface IService {
    String name( String name);

    String password(String password);

    Integer ChangePassword(String name1,String password);
}
