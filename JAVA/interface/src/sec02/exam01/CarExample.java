package sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        car.backLeftTire = new KumhoTire();
        car.backRightTire= new KumhoTire();

        car.run();
    }
}
