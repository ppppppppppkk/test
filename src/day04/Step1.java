package day04;

import java.util.Random;

public class Step1 {    //class s
    public static void main(String[] args) {    //main s


        //제어문 : 1. 조건문 2. 반복문
        // 흐름제어 : 조건문({} 이후 정상흐름)
        //           반복문({} 이후 제어문으로 되돌아감) - 루핑
        // if 문
            // if(조건식) { 실행문; 실행문; }
            // if(조건식) 실행문;
            // if 조건식 {} 실행문 {}

        int score = 93; //1. 변수 선언

        if(score >= 90) { // if s
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다.");
        } // if e
        if(score < 90)
            System.out.println("점수가 90보다 적습니다.");
            System.out.println("등급은 B입니다");

        if(score >=90) {    //if s
            System.out.println("점수가 90보다큼");
            System.out.println("등급은 A입니다");
        } else {    //아니면
            System.out.println("점수가 90보다 적습니다");
            System.out.println("등급은 B입니다");
        }   // if e

        if(score >= 90){
            System.out.println("점수가 100~90입니다");
            System.out.println("등급은 A등급 입니다.");
        }else if(score >= 80){
            System.out.println("점수가 80~90입니다");
            System.out.println("등급은 B등급 입니다.");
        }else if(score >= 70){
            System.out.println("점수 70~79입니다.");
            System.out.println("등급은 C등급 입니다");
        }else {
            System.out.println("점수가 70미만입니다.");
            System.out.println("등급은 D등급 입니다.");
        }

        System.out.println("0이상 ~1미만 난수/랜덤 생성:" +Math.random());
        System.out.println( new Random() );
        System.out.println( new Random().nextInt() ) ;

       // int num = Math.random();
       //  int num = Math.random()*6;
        int num = (int)(Math.random()*6 +1); //(int) 강제타입변환

        Random random = new Random();
        //클래스명 변수명 = new 클래스명();    //클래스에 해당하는 객체 생성(객체 만드는 이유 : 라이브러리
       // int num2 = random.nextInt(bound:6);// int 허용범위내 난수 생성
        int num2 = random.nextInt(6)+1;

       if( num2 == 1){
           System.out.println("주사위 1입니다.");
       }
       else if( num2 == 2){
            System.out.println("주사위 2입니다.");
        }
       else if( num2 == 3){
            System.out.println("주사위 3입니다.");
        }
       else if( num2 == 4){
            System.out.println("주사위 4입니다.");
        }
       else if( num2 == 5){
            System.out.println("주사위 5입니다.");
        }
       else {
            System.out.println("주사위 6입니다.");
        }


    }   //main e

} //class e
