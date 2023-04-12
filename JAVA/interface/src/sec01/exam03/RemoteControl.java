package sec01.exam03;

public interface RemoteControl {
    //상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 매소드
    void turnOn();

    void turnOFF();

    void setVolume(int volume);
}
