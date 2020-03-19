package com.enjoy.config;

import com.enjoy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//使用excludeFilters需要useDefaultFilters=true
@ComponentScan(value="com.enjoy.cap2",includeFilters = {
    @ComponentScan.Filter(type=FilterType.ANNOTATION,classes= {Controller.class})
},useDefaultFilters = false)
public class MainConfig2 {
    @Bean
    public Person person01(){
        return new Person("haha",19);
    }
}
