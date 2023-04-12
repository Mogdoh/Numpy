package sec02.exam04;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            System.out.println("강제 타입변환이 가능합니다.");
            bus.checkFare();
        } else {
            System.out.println("강제 타입변환이 불가능합니다.");
        }
        vehicle.run();
    }
}
