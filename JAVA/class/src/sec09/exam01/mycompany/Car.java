package sec09.exam01.mycompany;

import sec09.exam01.hankook.*;
import sec09.exam01.kumho.*;
import sec09.exam01.hyundai.Engine;
import sec09.exam01.kumho.Tire;


public class Car {
    //필드
    Engine engine = new Engine();
    SnowTire snowTire = new SnowTire();
    BigWidthTire bigWidthTire = new BigWidthTire();

    // Tire 클래스가 두개 존재
    // 이를 구분짓기 위해서 앞에 패키지를 적어서 정확히 표현을 해줬습니다.
    sec09.exam01.kumho.Tire tire = new sec09.exam01.kumho.Tire();
    sec09.exam01.hankook.Tire tire2 = new sec09.exam01.hankook.Tire();
}
