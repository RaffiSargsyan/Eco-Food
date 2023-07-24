package am.itspace.ecofood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about1")
    public String aboutPage() {
        return "about-01";
    }

}
