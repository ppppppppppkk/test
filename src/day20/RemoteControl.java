package day20;

import javax.swing.text.TabSet;

public interface RemoteControl {
    //인터페이스 선언

    // 멤버
    //1. 상수[ public static final] 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    //2. 추상 [ public abstract]메소드
    void turnOn();
    void turnOff();
    void setVolume(int Volume);

    //3. 디폴트[ default ] 메소드
    default void setMute(boolean mute){

    }
    static void changeBattery(){
        System.out.println("리모컨 건전지를 교환합니다.");
    }
    //private abstract void turnOff();


}
