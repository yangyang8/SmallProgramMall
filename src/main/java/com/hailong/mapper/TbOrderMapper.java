package com.hailong.mapper;

import com.hailong.pojo.TbOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbOrderMapper {
    int insert(TbOrder record);

    int insertSelective(TbOrder record);
}