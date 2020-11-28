package controller;

import controller.common.ResponseVo;
import controller.dto.BaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.Mvcservice;

@Controller
@RequestMapping(value = "/hello")
public class mvccontroller {

//    @Autowired
//    private Mvcservice mvcservice;

//    @GetMapping
//    private ResponseVo getRespose(@RequestBody BaseDto baseDto){
//        mvcservice.insert(baseDto);
//        return new ResponseVo("10000", "success", "httpok");
//    }

    @RequestMapping(value = "/select.do", method = RequestMethod.GET)
    @ResponseBody
    private ResponseVo hellomvc(){
        return new ResponseVo("10000", "success", "httpok");
    }
}
