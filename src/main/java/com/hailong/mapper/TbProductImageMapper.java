package com.hailong.mapper;

import com.hailong.pojo.TbProductImage;

public interface TbProductImageMapper {
    int insert(TbProductImage record);

    int insertSelective(TbProductImage record);
}