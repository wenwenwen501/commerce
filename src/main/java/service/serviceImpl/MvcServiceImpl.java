package service.serviceImpl;

import controller.dto.BaseDto;
import mapper.MvcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.Mvcservice;

@Service
public class MvcServiceImpl implements Mvcservice {

    @Autowired
    private MvcMapper mvcMapper;

    public void insert(BaseDto baseDto) {
        mvcMapper.insert(baseDto);
    }
}
