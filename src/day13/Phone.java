package day13;

public class Phone {

    public String model;
    public String color;

    //1. 매개변수 : x , 반환값 : x
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    //2. 매개변수 : String , 반환값 x
    public void sendVoice(String message){
        System.out.println("자기 : " + message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방 " + message);
    }
    public void hangup(){
        System.out.println("전화를 끊습니다.");
    }
}
