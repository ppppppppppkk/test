package day06;

import java.util.Scanner;

public class Step2 { // c s

    public static void main(String[] args) { // m s

        //문자열 선언 : String 클래스 사용한다.
        String name;            //스택영역(변수)선언
        name = "홍길동";         //스택영역에 힙영역(객체)의 주소 대입
        String hobby = "여행";  //힙영역(객체)의 주소를 스택영역에 대입
        //2. 문자열 비교
            // 1. ==
        String name1 = "홍길동";   //힙영역?
        String name2 = "홍길동";   //힙영역?
        System.out.println( name1 == name2);    //같다.

        String name3 = new String("홍길동");
        System.out.println( name2 == name3); //다르다 스택이 가지는 주소/참조 값 비교

        // .은 접근연산자 : 현재참조(객체)로 이동 .equals 함수 써
        System.out.println( name1.equals(name2)); //같다
        System.out.println( name1.equals(name3)); //같다 스택이 가지는 주소/참조의 내부 비교

        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();

        System.out.println( name1 == inputName);
        System.out.println( name1.equals(inputName));


        // null(객체없다) VS "" VS " "
        String hobby1 = "";
        if(hobby1.equals("")){ //if s
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        } // if e

        String hobby2 = null;
        if(hobby2 != null && hobby2.equals("")){
            System.out.println("문자열 객체가 존재하면서 문자열 비교");
        }

    } // m e
}// c e
