package com.hailong.mapper;

import com.hailong.pojo.TbProductProperty;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbProductPropertyMapper {
    int insert(TbProductProperty record);

    int insertSelective(TbProductProperty record);
}