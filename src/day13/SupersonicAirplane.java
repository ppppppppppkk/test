package day13;

public class SupersonicAirplane extends Airplane{
    //상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    //상태 필드 선언
    public int flyMode = NORMAL;

    //오버라이딩 기존의 상속받은 메소드에서 재정의
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }else{
            //Aiaplane 객체의 fly()메소드 호출
            super.fly();
        }

    }
}
