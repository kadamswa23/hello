package com.example.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello welcome to first kubernets deployment....");
    }

    @GetMapping("/hi")
    public ResponseEntity<String> sayHi(){
        return ResponseEntity.ok("Hiiiiii");
    }

}
