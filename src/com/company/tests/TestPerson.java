package com.company.tests;

import com.company.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person("Ilia", "89778116787", "1@.ru", 19, "male");
        System.out.println(person1.printInfo());
        System.out.println("---------------------------------------");
    }
}
