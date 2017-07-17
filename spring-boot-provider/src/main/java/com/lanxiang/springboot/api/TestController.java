package com.lanxiang.springboot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lanxiang on 2017/7/17.
 */

@RestController
@RequestMapping(value = "api/test")
public class TestController {

    @RequestMapping(value = "a")
    public String testA() {
        return "Hello A";
    }
}
