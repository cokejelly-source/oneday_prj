package kr.co.oneday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classDetail")
public class ClassDetailController {

    @GetMapping
    public String useClass() {
        System.out.println("★★★★ Controller 실행 ★★★★");
        return "classDetail/classDetail";
    }
}
