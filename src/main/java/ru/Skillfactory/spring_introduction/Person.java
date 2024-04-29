package ru.Skillfactory.spring_introduction;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("dogBean")
    private Pet pet;
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println("Person with pet created");
//    }

    public Person() {
        System.out.println("Person created");
    }

    public void callYourPet() {
        System.out.println("Привет, животное!");
        pet.say();
    }


    public void setPet(Pet pet) {
        System.out.println("Class Person: Pet setter");
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
