package com.company.controller;

import com.company.controller.common.ResponseVo;
import com.company.controller.dto.BaseDto;
import com.company.rocketmq.Rcconsumer;
import com.company.rocketmq.Rcproducer;
import com.company.service.MvcService;
import com.company.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/hello")
public class mvccontroller {

//    @Autowired
//    private MvcService mvcService;
//    @Autowired
//    RedisService redisService;
    @Autowired
    @Qualifier("rcproducer")
    Rcproducer rcproducer;
    @Autowired
    @Qualifier("rcconsumer")
    Rcconsumer rcconsumer;

//    @PostMapping(value = "/update.do")
//    private ResponseVo getRespose(@RequestBody BaseDto baseDto){
//        mvcService.insert(baseDto);
//        return new ResponseVo("10000", "success", "httpok");
//    }
//
    @GetMapping(value = "/select.do")
    private ResponseVo hellomvc(){
        return new ResponseVo("10000", "success", "httpok"
        );
    }
//
//    @GetMapping(value = "/redis.do")
//    private ResponseVo helloRedis() throws Exception {
//        redisService.set("redis","Redis Success",1000000);
//        String key = (String) redisService.get("redis",String.class);
//        System.out.println(key);
//        return new ResponseVo("10000", "success", redisService.get("redis",String.class)
//        );
//    }

    @GetMapping(value = "/Rqproducer.do")
    private ResponseVo sendrocketmq(){
        try{
            rcproducer.sendmsg();
        }catch (Exception e){
            return new ResponseVo("10001","fail",e);
        }
        return new ResponseVo("10000","success","rqconsumer");
    }

    @GetMapping(value = "/Rqconsumer.do")
    private ResponseVo getrocketmq(){
        try{
            rcconsumer.getmsg();
        }catch (Exception e){
            return new ResponseVo("10001","fail",e);
        }
        return new ResponseVo("10000","success","rqconsumer");
    }

}
