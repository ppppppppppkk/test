package day03;

import java.util.Scanner;

public class Step3 { //c s
    public static void main(String[] args) { //m s

        Scanner scanner = new Scanner(System.in);

        //1. 문제1
        /*
        System.out.print("정수 입력 :"); int 정수1 = scanner.nextInt();
        String 출력1 = " ";
        출력1 = (정수1%7) == 0 ? "0" : "x";
        System.out.println("입력받은 정수는 7의배수가 = " + 출력1);
        */

        //2. 문제2
        /*
         System.out.print("문제2 정수 입력해주세요 :");
         int a = scanner.nextInt();
         System.out.println( a%2 !=0 ? "0" : "x");
        */

        //3. 문제3
        /*
        System.out.print("문제3 정수 입력:");
        int b = scanner.nextInt();
        System.out.println("7의 배수이면서 짝수 : "+(b%7 ==0 && b%2==0 ? "0": "x"));
        */

        //4. 문제4
        /*
        System.out.print("문제4 정수 입력:");
        int b = scanner.nextInt();
        System.out.println("11의 배수이거나 짝수 : "+(b%7 ==0 || b%2==0 ? "0": "x"));
        */

        //5. 문제5
        /*
        System.out.println("정수4 입력 :");
        int a = scanner.nextInt();
        System.out.println("정수5 입력");
        int b = scanner.nextInt();
        System.out.println(a > b ? a : b);
        */

        /*
        // 6번 문제
        System.out.println("반지름 입력하세요 :");
        int r = scanner.nextInt();
        double 원넓이 = r*r*3.14;
        System.out.printf("원넓이 : %2f",원넓이);
        */
        //7번문제

        /*
        System.out.println("실수1:"); double 실수1 = scanner.nextDouble();
        System.out.println("실수2:"); double 실수2 = scanner.nextDouble();
        double 퍼센트 = 실수1/실수2*100;
        System.out.printf("퍼센트:%.1f %%",퍼센트);
        */

        //8번 문제
        /*
        System.out.println("윗변:"); double a = scanner.nextDouble();
        System.out.println("밑변:"); double b = scanner.nextDouble();
        System.out.println("높이:"); double h = scanner.nextDouble();
        System.out.printf("넓이: %.1f" , (a+b)*h/2);
        */
        //9번 문제
        /*
        System.out.println("키 입력:"); double a1 = scanner.nextDouble();
        int h = scanner.nextInt();
        int 표준체중=(int)((h-100)*0.9);
        System.out.println("표준체중 :" +표준체중);
        */
        //10문제
        /*
        System.out.println("키 입력:"); double h1 = scanner.nextDouble();
        System.out.println("몸무게 입력:"); double w = scanner.nextDouble();

        System.out.printf("BMI: %.2f",((h/100)*(h/100)));
        */
        //11문제
        /*
            System.out.print("inch :"); double inch = scanner.nextDouble();
            System.out.printf("cm : %.2f",inch *2.54);

         */
        //12문제
        System.out.print("중간고사 점수 입력 :");
        double a1 = scanner.nextDouble();
        System.out.print("기말고사 점수 입력 :");
        double a2 =scanner.nextDouble();
        System.out.print("수행평가 점수 입력:");
        double a3 =scanner.nextDouble();
        System.out.printf("");

        //13문제

        //14문제
        /*
        System.out.print("나이:");
        int 나이 = scanner.nextInt();
        System.out.println(나이 >= 40 ? "중년" : 나이 >= 20 ? "성인" : 나이 >= 10 ? "학생": "아이");
        */
        //15문제
        /*
        System.out("국어:")
        System.out.print("국어 입력:");
        System.out.print("수학 입력:");
        System.out.print("영어 입력:");
        */

        //16문제
        /*
        System.out.print("로그인:");
        System.out.print("비밀번호:");
        */

        //17번 문제

        System.out.println("정수4 입력 :");
        int a = scanner.nextInt();
        System.out.println("정수5 입력");
        int b = scanner.nextInt();
        System.out.println("정수6 입력");
        int c = scanner.nextInt();
        //System.out.println( a > b ? a > c ? a : c : b > c ? b : c);
        System.out.println( a >=b && a>=c ? a : b>=a && b>=c ? b : c);


    }   // m e
} //c e
/*
        문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.

        문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.

        문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.

        문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.

        문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.

        문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
                계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

        문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
        예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

        문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
                계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

        문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
                계산식) 표준체중 계산식 = > (키 - 100) * 0.9

        문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

        문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
                계산식) 1 inch -> 2.54cm

        문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

        문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
        int x = 10; 1. x에 대입
        int y = x-- + 5 + --x;
        우항먼저 : 2. x-- 호출
        printf(" x의 값 : %d , y의값 :  %d ", x, y)

        문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

        문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

        문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력

        문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
        */