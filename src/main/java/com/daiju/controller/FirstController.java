package com.daiju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author WDY
 * @Date 2020-12-01 19:48
 * @Description TODO
 */
@Controller
public class FirstController {
    @RequestMapping("/test1")
    public String test1(Model model){
        model.addAttribute("msg","test1 success!!!");
        return "test1";
    }
    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg", "test2 success!!!");
        return "test2";
    }
}
