package com.hailong.mapper;

import com.hailong.pojo.TbImage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbImageMapper {
    int insert(TbImage record);

    int insertSelective(TbImage record);
}