package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("test")
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("info","后台信息");
        modelAndView.setViewName("test");
        return modelAndView;
    }

}
