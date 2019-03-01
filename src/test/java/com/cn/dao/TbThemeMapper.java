package com.cn.dao;

import com.cn.pojo.TbTheme;

public interface TbThemeMapper {
    int insert(TbTheme record);

    int insertSelective(TbTheme record);
}