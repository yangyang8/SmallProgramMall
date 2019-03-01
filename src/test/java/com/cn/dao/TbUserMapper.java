package com.cn.dao;

import com.cn.pojo.TbUser;

public interface TbUserMapper {
    int insert(TbUser record);

    int insertSelective(TbUser record);
}