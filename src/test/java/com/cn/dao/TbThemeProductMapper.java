package com.cn.dao;

import com.cn.pojo.TbThemeProduct;

public interface TbThemeProductMapper {
    int insert(TbThemeProduct record);

    int insertSelective(TbThemeProduct record);
}