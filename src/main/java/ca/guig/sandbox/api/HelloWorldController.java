package ca.guig.sandbox.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

}
