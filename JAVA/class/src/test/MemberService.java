package test;

public class MemberService {
    // method
    // String 참조 변수에는 주소값을 가지고 있어서 주소값 비교(==)는 객체 비교가 된다.
    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            System.out.println("로그인 되었습니다");
            return true;
        } else {
            return false;
        }
    }
    void logout(String id) {
        System.out.println("로그아웃 되었습니다");
    }
}
