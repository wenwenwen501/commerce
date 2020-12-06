package com.company.service.serviceImpl;

import com.company.controller.dto.BaseDto;
import com.company.mapper.MvcMapper;
import com.company.service.MvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MvcServiceImpl implements MvcService {

    @Autowired
    private MvcMapper mvcMapper;

    public void insert(BaseDto baseDto) {
        mvcMapper.insert(baseDto);
    }
}
