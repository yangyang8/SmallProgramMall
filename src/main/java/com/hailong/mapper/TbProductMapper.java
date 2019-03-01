package com.hailong.mapper;

import com.hailong.pojo.TbProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbProductMapper {
    int insert(TbProduct record);

    int insertSelective(TbProduct record);
}