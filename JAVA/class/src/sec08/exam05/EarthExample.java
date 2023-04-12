package sec08.exam05;

public class EarthExample {
    public static void main(String[] args) {
        System.out.println("지구의 반지름:" + Earth.EARTH_RADIUS+ "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_AREA + "km^2");

        // final 상수는 카워드가 있어서 값을 변경할 수 없다
        // Earth.EARTH_RADIUS = 1.0;
    }
}
