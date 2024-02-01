package tech.zimmerli.springhtmx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BaseController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/extra-infos")
    public String furtherInfo(Model model) {
        return "fragments :: extra-info";
    }
}
