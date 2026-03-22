package com.codeio.helloworld.demo.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {
    @GetMapping("/hello")
    String getHelloworld(){
        return "Hello world";
    }
}
