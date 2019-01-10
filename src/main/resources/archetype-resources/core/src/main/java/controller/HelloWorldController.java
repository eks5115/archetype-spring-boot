package ${package}.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eks5115
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello_world")
    public String helloWorld() {
        return "hello world";
    }
}
