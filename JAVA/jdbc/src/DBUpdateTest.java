import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUpdateTest {
    private static final String URL = "jdbc:mariadb://localhost:3306/mydatabase";
    private static final String USER = "root";
    private  static final String PWD = "playdata";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
            System.out.println("DB 연결 성공");

            update(conn);
//            delete(conn);


        } catch (SQLException e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }

    private static void update(Connection conn) {
        String sql = "UPDATE employees SET first_name = ? WHERE emp_no = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "Jane");
            pstmt.setInt(2, 10006);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "개의 레코드가 업데이트되었습니다.");
        } catch (SQLException e) {
            System.out.println("UPDATE 쿼리 실행 실패");
            e.printStackTrace();
        }
    }
}
