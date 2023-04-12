import java.sql.*;

public class MariaDbExample {
    private static final String URL = "jdbc:mariadb://localhost:3306/mydatabase";
    private static final String USER = "root";
    private  static final String PWD = "playdata";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
            System.out.println("DB 연결 성공");

            select(conn);
            insert(conn);
            update(conn);
//            delete(conn);



        } catch (SQLException e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }

    private static void delete(Connection conn) {
        String sql = "delete from mytable where id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1,1);
            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 삭제했습니다");
        } catch (SQLException e) {
            System.out.println("삭제 실패");
            e.printStackTrace();
        }
    }

    private static void update(Connection conn) {
        String sql = "update";
    }

    private static void insert(Connection conn) {
        String sql = "insert into mytable (id,name) values(?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, 1);
            stmt.setString(2, "Doremipasol");
            int rowCount = stmt.executeUpdate();
            System.out.println(rowCount + "개의 행을 추가했습니다");
        } catch (SQLException e) {
            System.out.println("추가 실패");
            e.printStackTrace();
        }
    }

    private static void select(Connection conn) {
        String sql = "select * from mytable";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.print("id = " + id);
                System.out.println(", name = " + name);

            }
        } catch (SQLException e) {
            System.out.println("조회 실패");
            e.printStackTrace();
        }
    }
}
