package cn.bdqn.service.impl;

import cn.bdqn.mapper.IMapper;
import cn.bdqn.mapper.IbillMapper;
import cn.bdqn.service.IbillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements IbillService {
    @Autowired
    private IbillMapper ibillMapper;
    @Override
    public Integer order(String address, Integer kg, String telephon) {
        return ibillMapper.order(address,kg,telephon);
    }
}
