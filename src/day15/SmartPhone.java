package day15;

public class SmartPhone extends Phone {
    SmartPhone(String owner){
        super(owner);
    }

    //메소드 선언
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
