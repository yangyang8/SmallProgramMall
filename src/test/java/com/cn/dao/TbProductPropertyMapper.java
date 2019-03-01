package com.cn.dao;

import com.cn.pojo.TbProductProperty;

public interface TbProductPropertyMapper {
    int insert(TbProductProperty record);

    int insertSelective(TbProductProperty record);
}