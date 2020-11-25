package controller;

import controller.common.ResponseVo;
import controller.dto.BaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import service.Mvcservice;

@Controller
@ResponseBody
public class mvccontroller {

    @Autowired
    private Mvcservice mvcservice;

    @GetMapping
    private ResponseVo getRespose(@RequestBody BaseDto baseDto){
        mvcservice.insert(baseDto);
        return new ResponseVo("10000", "success", "httpok");
    }
}
