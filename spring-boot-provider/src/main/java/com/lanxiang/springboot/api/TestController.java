package com.lanxiang.springboot.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lanxiang.springboot.temp.User;

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

    @RequestMapping(value = "b", method = RequestMethod.POST)
    @ResponseBody
    public User testB(@RequestBody User param) {
        User user = new User();
        user.setAge(param.getAge() + 1);
        user.setName(param.getName() + "wryyyyyyyy");
        return user;
    }
}
