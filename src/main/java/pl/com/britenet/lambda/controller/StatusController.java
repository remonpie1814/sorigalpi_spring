package pl.com.britenet.lambda.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
@CrossOrigin
public class StatusController {

    public static String ALIVE = "ALIVE";

    @GetMapping(path="/")
    public String getDefault() {
    	System.out.println("default로 실행");
    	return ALIVE;
    }
    
    @GetMapping(path = "/status")
    public String getStatus() {
        return ALIVE;
    }
}
