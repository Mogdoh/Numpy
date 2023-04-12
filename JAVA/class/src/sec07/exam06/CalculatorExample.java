package sec07.exam06;

import sec07.exam06.Calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        // 정사격형의 넓이 구하기
        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10,20);

        //결과 출력
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
