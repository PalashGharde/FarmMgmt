package com.asu.sd.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping("/")
    public String hello() {
    	String str = "WHAZZUP!!!!!\n Hello Palash, Sriranjan, Ravi";
        return str;
    }
}
