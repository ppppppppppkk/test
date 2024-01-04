package day03;

import java.util.Scanner;

public class Step4 {    //c s
    public static void main(String[] args) { //m s
        Scanner scanner = new Scanner(System.in);
        // Scanner 클래스 입력시[ 라이브러리-> 호출]
        // 자동완성시 자동으로 클래스 위에 import java.util.Scanner; 확인
        // 직접입력시 직접 클래스 위에 import java.util.Scanner; 작성
        // System, String 등등 package java.lang;

        // if 조건문
        // 1.
        System.out.println("정수입력");
        int point = scanner.nextInt();
        // 만약에 내가 입력한 값이 저장된point변수가 80보다 이상이면 출력문이 실행되고 아니면 실행 안된다
        if (point >= 80) {
            System.out.println("입력받은 값은 80이상입니다.");
        }
        // 만약에 내가 입력한 값이 저장된 point변수의 값이
        // 90이상이면 true 합격출력 아니면 false이면 불합격 출력
        if (point >= 90) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }


        //3.
        if (point >= 90) {
            System.out.println("A등급");
        } else if (point >= 80) {
            System.out.println("B등급");
        } else if (point >= 70) {
            System.out.println("C등급");
        } else {
            System.out.println("탈락");
        }

            if (point >= 90) {
                System.out.println("A등급");
            }
            if (point >= 80) {
                System.out.println("B등급");
            }
            if (point >= 70) {
                System.out.println("C등급");
            }


            //4.중첩 조건
            char cex = 'M';
            if (cex == 'M' || cex == 'm') { //만약에 성별이 m남자이면
                if (point >= 90) {
                    System.out.println("남자 우수상");
                }

            } else {  //아니고 성별이 w(여자)이면
                // 여자(조건1 false) 이면서 점수가 90점 이상이면
                if (point >= 90) {
                    System.out.println("여자 우수상");
                }
            }

            //예시 ) 스위치 변수 활용
            String id = scanner.next();
            String pw = scanner.next();
            // equals() : 문자열 비교 메소드 지원, 문자열.equals(비교할문자열) => 결과 같으면 true, 다르면false
            boolean sw = false;

            if(id.equals("admin") && pw.equals("1234") ) { sw = true; }
            if ( sw ){
                System.out.println("로그인성공");
            }else{
                System.out.println("로그인실패");}








        }//m e
    } // c e

