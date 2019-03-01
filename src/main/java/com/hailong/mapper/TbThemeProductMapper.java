package com.hailong.mapper;

import com.hailong.pojo.TbThemeProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbThemeProductMapper {
    int insert(TbThemeProduct record);

    int insertSelective(TbThemeProduct record);
}