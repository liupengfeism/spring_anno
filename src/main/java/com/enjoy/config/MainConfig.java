package com.enjoy.config;

import com.enjoy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {

    @Bean("person001")
    public Person person01(){
        return new Person("haha",19);
    }
}
