package am.itspace.ecofood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactUs {
    @GetMapping("/contactUs")
    public String contact(){
        return "contact-01";
    }
}
