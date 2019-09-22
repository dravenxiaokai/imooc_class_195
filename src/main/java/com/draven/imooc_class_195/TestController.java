package com.draven.imooc_class_195;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@Slf4j
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
