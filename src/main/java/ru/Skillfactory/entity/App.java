package ru.Skillfactory.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    Student student= (Student) context.getBean("student");
    System.out.println(student.getId());
    System.out.println(student.getFirstName());
    System.out.println(student.getLastName());

  }
}
