package com.alex.spring;

import com.alex.spring.db.entities.Student;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String...args) {
        Map<Student, String> map = new HashMap<Student, String>();
        map.put(new Student("Paul", "Wall", "alan@gmail.com"), "Hello");
        System.out.println(new Student("Paul", "Wall", "alan@gmail.com").equals(new Student("Paul", "Wall", "alan@gmail.com")));
        System.out.println(map.get(new Student("Paul", "Wall", "alan@gmail.com")));
    }
}
