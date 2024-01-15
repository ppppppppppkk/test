package day10;

public class Car2 {
    //멤버
    //1.필드(정적)
    int speed;
    static  int speed2;
    //2.생성자
    //3.메소드(정적)
    void  run(){ }//인스턴스 메소드

    static void simulate(){
      //  System.out.println( this.speed );
        System.out.println( speed2);
        // this는 해당 메소드를 실행한 객체의 주체자
        // static 객체없이 사용하는 메소드이니까 곧 this가 없다
    }
    void simulate2() {
        System.out.println(this.speed);
        System.out.println(speed2);
    }
    public static void main(String[] args) {

        simulate();
        //  simulate2();

        new Car2().simulate2();

    }
}
