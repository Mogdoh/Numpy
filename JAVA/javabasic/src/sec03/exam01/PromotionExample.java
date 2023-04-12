package sec03.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = "+ intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longVlaue: "+ longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("longVluae:"  + floatValue);


        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);

    }
}
