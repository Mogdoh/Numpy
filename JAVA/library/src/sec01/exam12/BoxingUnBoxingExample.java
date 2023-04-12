package sec01.exam12;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing
//        Integer obj1 = new Integer(100);
//        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");

        //Unboxing
        int value3 = obj3.intValue();

        System.out.println("value3 = " + value3);

    }
}
