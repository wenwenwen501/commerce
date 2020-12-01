package com.company.mapper;


import com.company.controller.dto.BaseDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MvcMapper {

    void insert(BaseDto baseDto);

}
