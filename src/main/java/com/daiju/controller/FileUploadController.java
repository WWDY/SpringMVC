package com.daiju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author WDY
 * @Date 2020-12-16 13:10
 * @Description TODO
 */
@Controller
public class FileUploadController {

    @PostMapping("/upload")
    @ResponseBody
    public Map<String,Object> testUpload(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("==================");
        String originalFilename = file.getOriginalFilename();
        file.transferTo(new File("C:\\Users\\wdy\\Desktop",UUID.randomUUID()+originalFilename));
        Map<String, Object> res = new HashMap<>();
        res.put("data", "upload success");
        return res;
    }
}
