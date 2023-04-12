package sec07.exam03;

public class Car {
    //필드
    int gas;

    //매소드
    void setGas(int gas) {
        this.gas = gas; //매개변수로 받은 값을 필드에 저장한다.
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        } else {
            System.out.println("gas가 있습니다");
            return true;
        }

    }
}
