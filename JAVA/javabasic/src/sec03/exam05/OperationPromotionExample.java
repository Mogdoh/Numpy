package sec03.exam05;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
//        byte byteValue3 = byteValue1 + byteValue2; // 산술연산의 결과가 int형으로 반환되어서 byte 타입의 변수에 담을 수 없었다
        int intValue1 = byteValue1 + byteValue2;
        System.out.println("intValue1 = " + intValue1);

        char charValue1 = 'A'; // 작은 따음표는 char 형의 리터럴 값이다.
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2; // 산술 연산의 결과가 int 형이기 때문에 담을 수 없다
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 = " + intValue2);
        System.out.println("출력 문자 = " + (char) intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3/ 4; //파이썬이라면 float 형으로 반환
        System.out.println("intValue4 = " + intValue4);

        int intValue5 = 10;
        // int intValue6 = intValue5 / 4.0; // int 리터럴과 double 리터럴을 산술 연산하면 그 변환값으 double이 된다
        // 범위가 더 큰 방향으로 타입이 통일된다.

        double doubleValue = intValue5 / 4.0;
        System.out.println("doubleValue = " + doubleValue);

        int x = 1;
        int y = 2;
        double result1 = (double) x / y;
        System.out.println("result1 = " + result1);

    }
}
