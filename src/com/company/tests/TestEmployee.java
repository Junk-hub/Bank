package com.company.tests;

import com.company.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sergei", "89778556787", "3@.ru", 40,"",3000.0, "consultant");
        System.out.println(employee1.printInfo());
        System.out.println("---------------------------------------");
    }
}
