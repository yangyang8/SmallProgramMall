package com.cn.dao;

import com.cn.pojo.TbProduct;

public interface TbProductMapper {
    int insert(TbProduct record);

    int insertSelective(TbProduct record);
}