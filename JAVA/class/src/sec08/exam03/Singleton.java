package sec08.exam03;

public class Singleton {

    //private 생성자는 외부 클래스에서 해당 클래스로 객체를 생성할 수 없습니다.
    // 즉 내부 클래스에서만 객체 생성이 가능합니다.
    private Singleton() {
    }

    // private의 접근 제한자를 사용하면 singleton 변수에 외부 클래스에서 접근이 불가능 하다
    // 즉 내부 클래스에서만 쓸 수 있는 변수가 됩니다.
    // 여기서 만든 클래스의 인스턴스가 이 프로그램에서 유일합니다.
    private static Singleton singleton = new Singleton();

    // static 매소드를 통해서 단 하나의 객체에 대한 주소 값을 받을 수 있다.
    static Singleton getInstance() {
        return singleton;

    }
}
