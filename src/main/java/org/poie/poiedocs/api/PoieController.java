package org.poie.poiedocs.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PoieController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/welcome")
    public String docs() {
        return "crypto-dark";
    }

}
