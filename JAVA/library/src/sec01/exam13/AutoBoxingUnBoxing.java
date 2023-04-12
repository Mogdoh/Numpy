package sec01.exam13;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        // 자동 박싱
        Integer obj = 100;
        System.out.println("obj = " + obj);

        //대입시 자동 언박싱
        int value = obj;
        System.out.println("value = " + value);

        //연산시 자동 UnBoxing
        int result = obj + 100;
        System.out.println("result = " + result);
    }
}
