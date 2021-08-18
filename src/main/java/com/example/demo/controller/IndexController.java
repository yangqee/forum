package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yangqee
 * @date 2021/8/16 1:47 下午
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        final String index = "index";
        return index;
    }
}
