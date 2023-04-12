import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        //MariaDB 연결정보
        String url = "jdbc:mariadb://localhost:3306/mydatabase";
        String user = "root";
        String password = "playdata";

        //MariaDB 연결
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // 연결 성공
            System.out.println("Connected to MariaDB!");
        } catch (SQLException e) {
            System.out.println("MariaDB에 대한 연결이 실패했습니다." + e.getMessage());
        }
    }
}
