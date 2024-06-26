package org.spring.one.springon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("method1")
    public Person testEndPoint(){

        return new Person("nata","lomidze",28L);
    }

}
