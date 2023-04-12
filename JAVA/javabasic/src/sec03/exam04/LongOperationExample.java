package sec03.exam04;

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 =10;
        byte value2 = 100;
        long value3 = 1000L;
        // int result1 = value1 + value2+ value3; // 산술 연산의 결과가 long 타입이라서 int 형 변수에 담을 수 없다.
        long result1 = value1 + value2+ value3;
        System.out.println("result1 = " + result1);
    }
}
