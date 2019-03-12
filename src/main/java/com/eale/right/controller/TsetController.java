package com.eale.right.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TsetController {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return new String("hello world");
    }

}
