import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            // MariaDB JDBC Driver를 메모리에 로드합니다.
            Class.forName("org.mariadb.jdbc.Driver");

            // DB 접속 정보
            String url = "jdbc:mariadb://localhost:3306/mydatabase";
            String user = "root";
            String password = "playdata";

            //DB에 대한 연결 가져오기
            conn = DriverManager.getConnection(url, user, password);

            //이부분은 커넥션에 대해 정상적으로 수행됐을 때 실행되는 부분
            System.out.println("Connected to MariaDB!");

        } catch (ClassNotFoundException e) {
            System.out.println("MariaDB JDBC Driver 클래스를 찾을 수 없습니다." + e.getMessage());
        } catch (SQLException e) {
            System.out.println("MariaDB에 대한 연결이 실패했습니다." + e.getMessage());
        } finally {
            try {
                //MariaDB 연결 종료
                if(conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("MariaDB 연결 종료에 실패했습니다." + e.getMessage());
            }
        }
    }
}
