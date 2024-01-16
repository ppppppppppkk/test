package day11;

public class Step2 {// c s

    public static void main(String[] args) {//m s

        //1. 객체 생성
        Car mycar = new Car();

        //speed필드가 private 이므로 외부에서 접근 불가능
        //myCar.speed = -50;

        // 메소드를 이용한 speed필드에 접근
        mycar.setSpeed(-50);//유효성검사
        System.out.println("myCar =" + mycar.getSpeed());

        mycar.setSpeed(60);
        System.out.println("mycar ="+ mycar.getSpeed());


        //만약에 car객체의 stop필드가 false 이면
        if(!mycar.isStop()){
            mycar.setStop(true);//멈춤
        }
        System.out.println("mycar.getSpeed()= " +mycar.getSpeed() );

    }//m e
}// c e
