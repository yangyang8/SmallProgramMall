package com.cn.dao;

import com.cn.pojo.TbOrder;

public interface TbOrderMapper {
    int insert(TbOrder record);

    int insertSelective(TbOrder record);
}