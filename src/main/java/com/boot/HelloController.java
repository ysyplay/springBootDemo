package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by runa on 2017/12/15.
 */
@RestController
@RequestMapping("/hello")
public class HelloController
{
    //注入
    @Value("${name}")
    private String name;

    @Autowired
    private People people;

    @RequestMapping("/say")
    public String say()
    {
        return people.getName()+"    "+people.getAge();
    }
}
