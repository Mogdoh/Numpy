package sec01.exam06;

public class Audio implements RemoteControl{
    //필드

    private int volume;

    //매소드
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume() {
        if (volume > sec01.exam04.RemoteControl.MAX_VOLUME) {
            this.volume = sec01.exam04.RemoteControl.MAX_VOLUME;
        } else if (volume < sec01.exam04.RemoteControl.MIN_VOLUME) {
            this.volume = sec01.exam04.RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨:" + this.volume);
    }
}
