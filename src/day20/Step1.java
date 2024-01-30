package day20;

public class Step1 {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        //RemoteControl rc = new Audio();
        //구현 객체 생성
        //new Audio();
        //
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(6);

        rc.setMute(true);
        rc.setMute(false);





        RemoteControl.changeBattery();
    }
}
