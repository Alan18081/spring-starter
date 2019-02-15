import com.alex.spring.db.entities.Instructor;
import com.alex.spring.db.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Jdbc {
    public static void main(String... args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
//            session.save(instructor);
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, 2);
            System.out.println("Detail: " + instructorDetail);
            System.out.println("Instructor: " + instructorDetail.getInstructor());
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
