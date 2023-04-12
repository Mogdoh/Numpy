package sec01.exam08;

public class SystemTimeExample {
    public static void main(String[] args) {
        // long 타입의 나노 시간의 단위로 현재 시각을 반환한다.
        long time1 = System.nanoTime();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long time2 = System.nanoTime();
        System.out.println("1~1000000까지의 합: "+ sum);
        System.out.println("계산에 "+ (time2-time1)+ "나노초가 소여되었습니다.");
    }
}
