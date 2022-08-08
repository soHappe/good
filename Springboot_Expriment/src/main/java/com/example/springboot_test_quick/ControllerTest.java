package com.example.springboot_test_quick;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerTest {

    @RequestMapping("/hello")
    public String test(){
        return "index";
    }
    @RequestMapping("/test2")
    public String test2(){
        return "login";
    }
}
