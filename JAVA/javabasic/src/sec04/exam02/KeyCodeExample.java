package sec04.exam02;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception { //예외가 발생되면 던진다
        int keyCode; //키코드를 저장할 변수

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

    }
}
