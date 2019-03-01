package com.cn.dao;

import com.cn.pojo.TbBannerItem;

public interface TbBannerItemMapper {
    int insert(TbBannerItem record);

    int insertSelective(TbBannerItem record);
}