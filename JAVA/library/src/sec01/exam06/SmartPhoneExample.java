package sec01.exam06;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        // SmartPhone 클래스의 toString() 매소드를 호출한 결과를 출력한다.
        String strobj = myPhone.toString();
        System.out.println(strobj);

        //smartPhone 클래스의 객체(=인스턴스)를 출력한다
        //객체에 대한 출력은 toString() 매소드의 호출 결과이다.
        System.out.println(myPhone);

    }
}
