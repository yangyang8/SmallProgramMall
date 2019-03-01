package com.hailong.mapper;

import com.hailong.pojo.TbUserAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbUserAddressMapper {
    int insert(TbUserAddress record);

    int insertSelective(TbUserAddress record);

    public List<TbUserAddress> findAll();
}