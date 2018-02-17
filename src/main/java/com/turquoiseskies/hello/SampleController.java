package com.turquoiseskies.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SuppressWarnings("HardcodedFileSeparator")
@Controller
@EnableAutoConfiguration
public class SampleController {


    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }

    @RequestMapping(value = "/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
