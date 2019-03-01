package com.cn.dao;

import com.cn.pojo.TbProductImage;

public interface TbProductImageMapper {
    int insert(TbProductImage record);

    int insertSelective(TbProductImage record);
}