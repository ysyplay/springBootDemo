package com.boot;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by runa on 2017/12/15.
 */
@Entity
@Component
@ConfigurationProperties(prefix = "people")
public class People
{

    @Id
    @GeneratedValue
    private Integer id;
    private  String name;
    private  Integer age;

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
