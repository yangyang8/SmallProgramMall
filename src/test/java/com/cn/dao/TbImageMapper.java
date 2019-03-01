package com.cn.dao;

import com.cn.pojo.TbImage;

public interface TbImageMapper {
    int insert(TbImage record);

    int insertSelective(TbImage record);
}