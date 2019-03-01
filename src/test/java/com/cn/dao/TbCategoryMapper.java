package com.cn.dao;

import com.cn.pojo.TbCategory;

public interface TbCategoryMapper {
    int insert(TbCategory record);

    int insertSelective(TbCategory record);
}