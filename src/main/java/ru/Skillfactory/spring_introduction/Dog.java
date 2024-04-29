package ru.Skillfactory.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
//@Scope("prototype")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void say(){
        System.out.println("Гав");

    }
    @Postconstruct
    public void init(){
        System.out.println("Dog init метод");
    }
    @Predestroy
    public void destroy(){
        System.out.println("Dog destroy");
    }
}
