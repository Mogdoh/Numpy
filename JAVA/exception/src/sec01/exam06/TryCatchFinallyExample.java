package sec01.exam06;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("String2"); // raise ClassNotFountException 발생
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } finally {
            System.out.println("무조건 실행이 된다.");
        }
    }
}
