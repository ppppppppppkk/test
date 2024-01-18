package day13;

public class Step1 { // c s
    public static void main(String[] args) { // m s

        SmartPhone myPhone = new SmartPhone("아이폰","파랑");

        System.out.println("모델 :" + "\t" + myPhone.model);
        System.out.println("색상 :" + "\t" + myPhone.color);

        System.out.println("와이파이 상태 :" + "\t" + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안뇽하세요. 저는 홍길동이에요");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
        myPhone.hangup();

        myPhone.setWifi(true);
        myPhone.internet();





    } // m e
} // c e
