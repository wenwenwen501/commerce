package controller;

import controller.common.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


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

    @RequestMapping(value = "/select.test", method = RequestMethod.GET)
    @ResponseBody
    private ResponseVo hellomvc(){
        return new ResponseVo("10000", "success", "httpok");
    }
}
