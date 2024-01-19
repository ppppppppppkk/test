package day14;

public class Child extends Parent{

    public String filed2;
    @Override   //상속받았을때[extends Parent] 부모 메소드 재정의
    // 조건: 부모클래스내 메소드와 선언부를 동일하게
    public void method1(){
        System.out.println("Parent.method1");
    }

    @Override
    public void method2() {
        System.out.println("Parent.method2");
    }
}
