package controller;

import controller.common.ResponseVo;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/hello")
public class mvccontroller {

//    @Autowired
//    private Mvcservice mvcservice;

//    @GetMapping
//    private ResponseVo getRespose(@RequestBody BaseDto baseDto){
//        mvcservice.insert(baseDto);
//        return new ResponseVo("10000", "success", "httpok");
//    }

    @GetMapping(value = "/select.do")
    private ResponseVo hellomvc(){
        return new ResponseVo("10000", "success", "httpok");
    }
}
