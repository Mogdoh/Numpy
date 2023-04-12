package sec01.exam09;

public class ClassExample {
    public static void main(String[] args) throws Exception {
        //첫번째 방법
        Class clazz = Car.class;

        //두번째 방법
        Class clazz2 = Class.forName("sec01.exam09.Car");

        //세번째 방법
        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println("clazz = " + clazz);
        System.out.println("clazz2 = " + clazz2);
        System.out.println("clazz3 = " + clazz3);

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}
