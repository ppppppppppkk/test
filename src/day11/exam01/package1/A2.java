package day11.exam01.package1;

public class A2 {

    public int field1; //public 필드
    int field2;         // default 필드
    private int field3; // private 필드

    public A2(){
        field1 = 1; //내부에서 접근 가능
        field2 = 2; //default 필드는 내부에서 접근 가능
        field3 = 1; //private 필드는 내부에서 접근 가능

        method1(); //public 내부 접근자 가능
        method2(); // default 내부 접근자 가능
        method3(); // private 내부 접근자 가능

    }

    public void method1(){}
    void method2(){}
    private void method3(){}






    public  A2(boolean b){}      //public 생성자
    A2 a1 = new A2( true );   //내부에서 생성자 호출
    A2(int b){}                  //default 생성자
    A2 a2 = new A2( true);    //내부에서 생성자 호출



    private A2(String s ){}
    A2 a3 = new A2("문자열");


}
