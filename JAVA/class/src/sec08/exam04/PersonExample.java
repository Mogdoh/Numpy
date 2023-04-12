package sec08.exam04;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567","홍길동");

        System.out.println("p1.nation = " + p1.nation);
        System.out.println("p1.ssn = " + p1.ssn);
        System.out.println("p1.name = " + p1.name);
        
        // final variable은 초기화가 끝났다면 재할당이 불가능하다
//        p1.nation = "usa";
//        p1.ssn = "12343124";
        p1.name = "이몽룡";
        
        
    }
}
