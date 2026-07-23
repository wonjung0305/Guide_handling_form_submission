package com.example.gshandlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    // 폼 화면 요청
    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new Greeting()); // 속성값은 비었지만, 폼과 연결할 기본 틀(객체) 전달
        return "greeting";
    }

    // 폼 제출 처리
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model){
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
