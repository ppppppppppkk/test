package day16;

public class Step1 {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();

        rc.turnOn();
        rc.setVolume(7);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        //인터페이스의 상수필드 호출
        System.out.println( RemoteControl.MAX_VOLUME);
        System.out.println( RemoteControl.MIN_VOLUME);


    }
}
