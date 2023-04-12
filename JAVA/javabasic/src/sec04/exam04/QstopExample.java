package sec04.exam04;

public class QstopExample {
    public static void main(String[] args) throws Exception{
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode = " + keyCode);
            if(keyCode == 113) { //113번에 해당되는 keyCode는 q이다
                break;
            }
        }
        System.out.printf("종료");
    }
}
