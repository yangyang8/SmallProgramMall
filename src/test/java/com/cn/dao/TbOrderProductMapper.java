package com.cn.dao;

import com.cn.pojo.TbOrderProduct;

public interface TbOrderProductMapper {
    int insert(TbOrderProduct record);

    int insertSelective(TbOrderProduct record);
}