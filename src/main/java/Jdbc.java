import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
    public static void main(String... args) {
        String url = "jdbc:mysql://localhost:3306/students_app?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";
        try {
            System.out.println("Conenction");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
