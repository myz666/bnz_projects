package com.myz.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application1Controller {
    @GetMapping("/service")
    public String service(){
        return "test" ;
    }


}
