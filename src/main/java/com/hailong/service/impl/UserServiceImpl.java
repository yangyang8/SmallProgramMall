package com.hailong.service.impl;

import com.hailong.mapper.TbUserAddressMapper;
import com.hailong.pojo.TbUserAddress;
import com.hailong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserAddressMapper addressMapper;
    @Override
    public List<TbUserAddress> findAll() {
        return addressMapper.findAll();
    }
}
