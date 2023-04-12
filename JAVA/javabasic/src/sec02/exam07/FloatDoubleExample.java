package sec02.exam07;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //float var1 = 3.14; // 실수 리터럴은 기본적으로 double 이기 때문에 double 에 해당하는 리터럴 값을 float 에 담을 수 없다
        float var2 = 3.14f;
        double var3 = 3.14;

        // 고정 소수점 표현방식의 정밀도 확인
        float var4 = 0.1234567890213546f; // 반올림해서 아래 값은 표현하지 않는다
        double var5 = 0.1234567890213546f;

        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
        
        // 과학적표기법(지수 표기법)
        double var6 = 3e6;
        float var7 =3e6f;
        double var8 = 2e-3;
        System.out.println("var6 = " + var6);
        System.out.println("var7 = " + var7);
        System.out.println("var8 = " + var8);

    }
}
