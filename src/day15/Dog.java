package day15;



public class Dog extends Animal{
    // 만일 상위클래스가 추상메소드가 있으면 필수/꼭
    // 부모클래스의 추상메소드를 재정의/오버라이딩한다
    public void sound(){
        System.out.println("멍멍");
    }
}
