package com.jpabari.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/greet")
    public String greet(){
        return "Hello from Jatin";
    }

}
