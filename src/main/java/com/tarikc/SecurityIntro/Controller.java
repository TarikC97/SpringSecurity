package com.tarikc.SecurityIntro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public  String test(){
        return "Testing Controller";
    }
}
