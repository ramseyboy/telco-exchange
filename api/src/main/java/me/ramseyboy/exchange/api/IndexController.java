package me.ramseyboy.exchange.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping
    public String index() {
        return "index";
    }
}
