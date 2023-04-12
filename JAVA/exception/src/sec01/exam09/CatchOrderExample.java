package sec01.exam09;

public class CatchOrderExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0]; //프로그램 파라미터가 없으면 raise ArrayIndexOutBoundsException
            String data2 = args[1];
            int value1 = Integer.parseInt(data1); //data1이 "a"라는 값으로 전달되면 오류 발생
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println("result = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}