package co.balansis.springboot2demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Controller {

    @RequestMapping("/")
    public String home() {
        return "Hello, Spring Boot 2 World!";
    }
}