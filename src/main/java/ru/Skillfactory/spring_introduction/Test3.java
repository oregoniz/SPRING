package ru.Skillfactory.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.callYourPet();
        context.close();
    }
}
