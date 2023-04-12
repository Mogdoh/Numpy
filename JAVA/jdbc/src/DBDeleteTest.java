import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDeleteTest {
        private static final String URL = "jdbc:mariadb://localhost:3306/mydatabase";
        private static final String USER = "root";
        private  static final String PWD = "playdata";

        public static void main(String[] args) {
            try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
                System.out.println("DB 연결 성공");

                delete(conn);



            } catch (SQLException e) {
                System.out.println("DB 연결 실패");
                e.printStackTrace();
            }
        }
    private static void delete(Connection conn) {
        String sql = "delete from employees where emp_no = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1,10006);
            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 삭제했습니다");
        } catch (SQLException e) {
            System.out.println("삭제 실패");
            e.printStackTrace();
        }
    }
}

