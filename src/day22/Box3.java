package day22;

public class Box3 <T> {

    //제네릭타입 : 클래스 선언시 타입을 정하지 않고 사용(객체)생성할때 정의

    //1. 필드
    private T t;
    //2. 생성자

    //3. 메소드

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
/*

    Box3 <Integer> box = new Box<>()
        box{
        private Inteager t
        public Integer getT() { return t; }
        public void setT( Integer t) { this.t = t; }

 */