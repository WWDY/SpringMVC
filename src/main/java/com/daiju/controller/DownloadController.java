package com.daiju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author WDY
 * @Date 2020-12-16 13:49
 * @Description TODO
 */
@Controller
public class DownloadController {
    @GetMapping("/download")
    public void test(HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();
        response.setHeader("Content-Disposition","attachment;filename=123.jpg");
        Files.copy(Paths.get("C:\\Users\\wdy\\Desktop\\a04b27b6-605f-40d8-9dc0-a1994ab6a81312868.jpg"),outputStream);
    }
}
