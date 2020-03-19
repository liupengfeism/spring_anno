package com.enjoy.bean;

import com.enjoy.config.MainConfig;
import com.enjoy.config.MainConfig2;
import com.enjoy.config.MainConfig3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void mainTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }
    @Test
    public void configTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
        //Person person = (Person) ac.getBean("person");
        //System.out.println(person);
        //获取bean的id
        String[] beanNamesForType = ac.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
    @Test
    public void configTest2(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);
        //获取 Spring 容器中定义的所有 JavaBean 的名称。
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }
    }
    @Test
    public void configTest3(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig3.class);
        //获取 Spring 容器中定义的所有 JavaBean 的名称。
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }
    }
}
