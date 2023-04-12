package test01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[필수 정보 입력]");

        System.out.printf("1. 이름");
        String strNum1 = scanner.nextLine();

        System.out.printf("2. 주민번호 앞 6자리");
        String strNum2 = scanner.nextLine();

        System.out.printf("2. 전화번호");
        String strNum3 = scanner.nextLine();

        System.out.println(strNum1);
        System.out.println(strNum2);
        System.out.printf(strNum3);
    }

}
