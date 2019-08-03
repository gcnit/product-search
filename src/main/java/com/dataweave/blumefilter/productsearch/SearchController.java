package com.dataweave.blumefilter.productsearch;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SearchController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
