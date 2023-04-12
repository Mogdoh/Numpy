package sec01.exam06;

public class Television implements RemoteControl{
    //필드

    private int volume;

    //method
    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
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
        System.out.println("현재 TV 볼륨:" + this.volume);
    }
}
