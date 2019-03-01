package com.hailong.mapper;

import com.hailong.pojo.TbUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbUserMapper {
    int insert(TbUser record);

    int insertSelective(TbUser record);
}