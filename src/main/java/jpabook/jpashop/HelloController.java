package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        // /hello로 요청이 들어오면 Model에 데이터를 담아서 넘김
        model.addAttribute("data", "hello");
        //hello.html로 자동으로 넘김
        return "hello";
    }
}
