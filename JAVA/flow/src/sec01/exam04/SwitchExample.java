package sec01.exam04;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;

        switch (num) {
            case 1:
                System.out.println("1이 나옴");
                break;
            case 2:
                System.out.println("2이 나옴");
                break;
            case 3:
                System.out.println("3이 나옴");
                break;
            case 4:
                System.out.println("4이 나옴");
                break;
            case 5:
                System.out.println("5이 나옴");
                break;
            // 앞의 case에서 모두 해당되지 않을 때 실행되는 부분
            default:
                System.out.println("6이 나옴");
                break;
        }
    }
}
