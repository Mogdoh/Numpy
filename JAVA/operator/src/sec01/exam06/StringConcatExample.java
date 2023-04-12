package sec01.exam06;

public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = "JDK" + 17.0;
        String str2 = str1 + 0.2;
        System.out.println("str2 = " + str2);

        String str3 = "JDK" +6+ 7.0;
        String str4 = str3 + 3.0 + "JDK";
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

    }
}
