package com.cn.dao;

import com.cn.pojo.TbUserAddress;

public interface TbUserAddressMapper {
    int insert(TbUserAddress record);

    int insertSelective(TbUserAddress record);
}