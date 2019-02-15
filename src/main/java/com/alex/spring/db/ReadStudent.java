package com.alex.spring.db;

import com.alex.spring.db.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ReadStudent {
    public static void main(String...args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            long id = 1;
            Student student = session.get(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
//            System.out.println(student.getFirstName() + " | " + student.getLastName());
        } finally {
            factory.close();
        }
    }

    private static void display(List<Student> students) {
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
