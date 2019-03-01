package com.cn.dao;

import com.cn.pojo.TbThirdApp;

public interface TbThirdAppMapper {
    int insert(TbThirdApp record);

    int insertSelective(TbThirdApp record);
}