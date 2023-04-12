package sec01.exam07;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;
        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매가값의 수가 부족합니다");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1); // data1 = "a"인 경우에 raise NumberFormatException
            int value2 = Integer.parseInt(data2);
            int result = value1 = value2;
            System.out.println("result = " + result);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
            return;
        }finally {
            System.out.println("숫자 값만 두개 입력하셔야 합니다.");
        }
    }
}
