package com.hailong.mapper;

import com.hailong.pojo.TbOrderProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbOrderProductMapper {
    int insert(TbOrderProduct record);

    int insertSelective(TbOrderProduct record);
}