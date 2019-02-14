package com.fang.driverprovider.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : zcg
 * @Data ：Create in 19:012019/2/14
 */
@RestController
public class HelloController {

    @GetMapping("/hellofirst.do")
    public String hello1() {
        System.out.println("提供者");
        return "世界，你好";
    }
}
