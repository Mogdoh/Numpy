import java.sql.*;

public class DBInsertTest {

    //DB 접속 정보
    private static final String URL = "jdbc:mariadb://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PWD = "playdata";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
            System.out.println("DB 연결 성공");

//            select(conn);
            insert(conn);
            update(conn);
//            delete(conn);
        } catch (SQLException e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }
    private static void update(Connection conn) {
        String sql = "update";
    }

    private static void insert(Connection conn) {
        String sql = "insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date) values(?,?,?,?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, 10006);
            stmt.setDate(2, Date.valueOf("1965-08-08"));
            stmt.setString(3,"John");
            stmt.setString(4,"Doe");
            stmt.setString(5,"M");
            stmt.setDate(6,Date.valueOf("1990-01-01"));

            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 추가했습니다");
        } catch (SQLException e) {
            System.out.println("추가 실패");
            e.printStackTrace();
        }
    }
}