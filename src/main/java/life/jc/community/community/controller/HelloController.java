package life.jc.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/greeting")
    public  String greeting(@RequestParam(name="name",required = false,defaultValue = "qunimade") String name, Model model){
        model.addAttribute(name="name");
        return "greeting";

    }
}
