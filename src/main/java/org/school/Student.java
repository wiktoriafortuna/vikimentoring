package org.school;

import Product.Product;

import java.util.List;

public class Student {
    String name;

    public Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
