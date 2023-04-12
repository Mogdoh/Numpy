import java.sql.*;
import java.util.Scanner;

public class InsertIntoExample {
        public static void main (String[]args){

            // DB 접속 정보
            final String url = "jdbc:mariadb://localhost:3306/mydatabase";
            final String user = "root";
            final String password = "playdata";

            Scanner scanner = new Scanner(System.in);
            System.out.println("이름을 입력하세요: ");
            String s = scanner.nextLine();
            String sql = "insert into mytable (id, name) value (?,?)";

            try (
                    Connection conn = DriverManager.getConnection(url, user, password);
                    // SQL 인젝션 공격에 대해 대비 -> 보안성 향상
                    // SQL 처리에 있어 오버헤드를 줄여서 성능 향상에도 도움을 줍니다
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ) {
                //첫 번째 물음표에 들어갈 값으로 int 7을 삽입하였습니다.
                preparedStatement.setInt(1, 7);

                //두 번째 물음표에 들어갈 값으로 String "네종훈"을 입력하였습니다.
                preparedStatement.setString(2, "네종훈");
                int resultCount = preparedStatement.executeUpdate();
                System.out.println(resultCount + "개의 행이 실행되었습니다.");
                } catch (SQLException e) {
                        System.out.println("데이터베이스로부터 데이터를 가져오는데 실패했습니다." + e.getMessage());
            }

            }
            ;
}

