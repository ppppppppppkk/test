package day13;

public class Step3 {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}

/*

 super() : 부모클래스의 생성자 호출
 super.메소드명: 부모클래스의 메소드 호출

 */
