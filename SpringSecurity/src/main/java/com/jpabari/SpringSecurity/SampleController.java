package com.jpabari.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/greet")
    public String greet(){
        return "Hello from Jatin";
    }

    @GetMapping("/admin/greet")
    public String greetAdmin(){
        return "Hello Admin from Jatin";
    }

}
