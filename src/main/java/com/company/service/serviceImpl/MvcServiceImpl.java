package com.company.service.serviceImpl;

import com.company.controller.dto.BaseDto;
import com.company.mapper.MvcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.service.Mvcservice;

@Service
public class MvcServiceImpl implements Mvcservice {

    @Autowired
    private MvcMapper mvcMapper;

    public void insert(BaseDto baseDto) {
        mvcMapper.insert(baseDto);
    }
}
