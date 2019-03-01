package com.hailong.mapper;

import com.hailong.pojo.TbThirdApp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbThirdAppMapper {
    int insert(TbThirdApp record);

    int insertSelective(TbThirdApp record);
}