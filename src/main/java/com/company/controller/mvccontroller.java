package com.company.controller;

import com.company.controller.common.ResponseVo;
import com.company.controller.dto.BaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.company.service.Mvcservice;


@RestController
@RequestMapping(value = "/hello")
public class mvccontroller {

    @Autowired
    private Mvcservice mvcservice;

    @PostMapping(value = "/update.do")
    private ResponseVo getRespose(@RequestBody BaseDto baseDto){
        mvcservice.insert(baseDto);
        return new ResponseVo("10000", "success", "httpok");
    }

    @GetMapping(value = "/select.do")
    private ResponseVo hellomvc(){
        return new ResponseVo("10000", "success", "httpok"
        );
    }
}
