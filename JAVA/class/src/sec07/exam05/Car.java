package sec07.exam05;

public class Car {
    // field

    int speed;

    // method

    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for (int i = 10; i <= 50; i+= 10) {
            speed =1;
            System.out.println("달립니다.(시속:" + speed + "km/h");
        }
    }
}

