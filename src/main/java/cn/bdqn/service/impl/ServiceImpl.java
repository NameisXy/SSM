package cn.bdqn.service.impl;

import cn.bdqn.bean.User;
import cn.bdqn.mapper.IMapper;
import cn.bdqn.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {
    @Autowired
    private IMapper mapper;

    @Override
    public String name(String name) {
        return mapper.name(name);
    }

    @Override
    public String password(String password) {
        return mapper.password(password);
    }

    @Override
    public Integer ChangePassword(String name1, String password) {
        return mapper.ChangePassword(name1,password);
    }

}
