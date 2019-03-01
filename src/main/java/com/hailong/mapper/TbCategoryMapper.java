package com.hailong.mapper;

import com.hailong.pojo.TbCategory;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TbCategoryMapper {
    int insert(TbCategory record);

    int insertSelective(TbCategory record);
}