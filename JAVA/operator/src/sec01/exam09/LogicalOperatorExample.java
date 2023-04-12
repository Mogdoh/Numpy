package sec01.exam09;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        //논리곱(and)
        //대문자 체크
        if ((charCode >= 65) & (charCode <= 90)) {
            System.out.println("대문자 이군요");
        }

        // 소문자 체크
        if ((charCode >= 97) & (charCode <= 122)) {
            System.out.println("소문자 군요");
        }

        // 0~9 숫자 확인
        if ((charCode >= 48) & (charCode <= 57)) {
            System.out.println("0~9 숫자 입니다");
        }
    }
}
