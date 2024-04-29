package ru.Skillfactory.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
        Dog dog = context.getBean(Dog.class);
        Dog dog2 = context.getBean(Dog.class);
        System.out.println(dog.equals(dog2));
        context.close();
    }
}
