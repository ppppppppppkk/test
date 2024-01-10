package day07;

public class Step2 {
    public static void main(String[] args) {

        // 1.객체 생성
        //new
        // 2. 생성자/클래스명
        //new 생성자/클래스명()
        // 3. 변수 선언
        //Car car ;
        // +
        Car car = new Car();

        //. 접근연산자
        System.out.println("모델명 :" +car.model);
        System.out.println("시동여부:"+ car.start);
        System.out.println("현재속도" + car.speed);



        // 필드는 객체의 데이터이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
            //1. 객체 생성
            Car2 myCar2 = new Car2();


       // System.out.println("제작회사:" + myCar2.company);


        Car2 yourCar2 = new Car2();
       // System.out.println("제작회사 :" + yourCar2.company);

    }
}
