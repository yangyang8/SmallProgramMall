package com.hailong.mapper;

import com.hailong.pojo.TbBanner;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbBannerMapper {
    int insert(TbBanner record);

    int insertSelective(TbBanner record);
}