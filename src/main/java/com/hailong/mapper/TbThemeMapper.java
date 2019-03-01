package com.hailong.mapper;

import com.hailong.pojo.TbTheme;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbThemeMapper {
    int insert(TbTheme record);

    int insertSelective(TbTheme record);
}