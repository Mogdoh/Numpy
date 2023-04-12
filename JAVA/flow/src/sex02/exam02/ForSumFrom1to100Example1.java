package sex02.exam02;

public class ForSumFrom1to100Example1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
