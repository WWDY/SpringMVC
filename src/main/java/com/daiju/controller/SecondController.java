package com.daiju.controller;

import com.daiju.entity.Stu;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author WDY
 * @Date 2020-12-09 11:16
 * @Description TODO
 */
@RestController
public class SecondController {

    @PostMapping("/json/test01")
    public Map<String,Object> test01(){
        Map<String, Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg", "success");
        return result;
    }

    @PostMapping("/json/test02")
    public Map<String, Object> test02(@RequestBody Stu stu){
        System.out.println(stu);
        Map<String, Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg", "success");
        return result;
    }
}
