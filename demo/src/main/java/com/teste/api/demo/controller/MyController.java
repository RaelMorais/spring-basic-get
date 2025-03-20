package com.teste.api.demo.controller;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MyController {

    @GetMapping("/person")
    public List<Person> getPerson() {
        Person person = new Person("João", 25, "345-987-09");
        Person person1 = new Person("Maria", 35, "876-987-78");
        Person person2 = new Person("Marcia", 34, "789-098-97");

        return Arrays.asList(person, person1, person2);
    }
}
