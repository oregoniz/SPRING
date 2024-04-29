package ru.Skillfactory.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getName());
//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();
        context.close();
    }
}
