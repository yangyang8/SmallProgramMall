package com.hailong.mapper;

import com.hailong.pojo.TbBannerItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbBannerItemMapper {
    int insert(TbBannerItem record);

    int insertSelective(TbBannerItem record);
}