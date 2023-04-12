package sec07.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5); // gas에 값을 세팅

        boolean gasState = myCar.isLeftGas();
        if (gasState) {
            System.out.println("출발합니다");
        }

        if (myCar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다");
        } else {
            System.out.println("gas를 주입하세요");
        }
    }
}
