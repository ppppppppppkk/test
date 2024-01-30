package day21;

public class Home {

    // 1. 필드에 익명 구현개체 대입
    //1. 인터페이스는 추상메소드[선언o실행x] 존재하므로 객체 생성 불가
    // 실행부를 구현(오버라이딩)
    // 1. 구현클래스
    // 2. 익명 구현 객체

    public void use2(){
            day21.RemoteControl rc = new day21.RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("TV를 켭니다ㅓ");
                }

                @Override
                public void turnOff() {
                    System.out.println("TV를 끕니다");
                }
            };
        }
    public void use3(RemoteControl rc){
       rc.turnOn();
       rc.turnOff();
    }


}
