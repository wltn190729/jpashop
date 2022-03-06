package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        // model 이란, 데이터를 실어서 view 에 넘기는 역할
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
