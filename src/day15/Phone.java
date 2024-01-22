package day15;

public abstract class Phone { //추상 클래스 : 서로 다른 클래스들의 공통적인 필드/메소드 설계
    //핃드 선언
    String owner;
    //생성자 선언
    Phone(String owner){
        this.owner = owner;
    }
    //메소드 선언
    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}


