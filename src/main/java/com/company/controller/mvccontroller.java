package com.company.controller;

import com.company.controller.common.ResponseVo;
import com.company.controller.dto.BaseDto;
import com.company.service.MvcService;
import com.company.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/hello")
public class mvccontroller {

    @Autowired
    private MvcService mvcService;
    @Autowired
    RedisService redisService;

    @PostMapping(value = "/update.do")
    private ResponseVo getRespose(@RequestBody BaseDto baseDto){
        mvcService.insert(baseDto);
        return new ResponseVo("10000", "success", "httpok");
    }

    @GetMapping(value = "/select.do")
    private ResponseVo hellomvc(){
        return new ResponseVo("10000", "success", "httpok"
        );
    }

    @GetMapping(value = "/redis.do")
    private ResponseVo helloRedis() throws Exception {
        redisService.set("redis","Redis Success",1000000);
        return new ResponseVo("10000", "success", redisService.get("redis",String.class)
        );
    }

}
