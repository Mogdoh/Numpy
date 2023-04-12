package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        System.out.println(args.length);

        String data1 = args[0];
        String data2 = args[1];

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
    }
}
