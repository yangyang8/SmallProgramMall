package com.cn.dao;

import com.cn.pojo.TbBanner;

public interface TbBannerMapper {
    int insert(TbBanner record);

    int insertSelective(TbBanner record);
}