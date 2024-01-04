package day03;

import java.util.Scanner;

public class Step2 { // c s

    public static void main(String[] args) { // m s

        //객체 사용이유: 미리 설계(Scanner입력관련) 된 메소드 쓸려고
        Scanner scanner = new Scanner(System.in);

        /*
        // 예제 1 : 작성자 , 내용 , 날짜 3가지를 문자로 입력받아 출력.
            // 1. 입력 , 변수
        System.out.print("작성자 :"); String 작성자 = scanner.next();
        System.out.print("내용 :"); String 내용 = scanner.next();
        System.out.print("날짜 :"); String 날짜 = scanner.next();
            // 2. 입력받은 데이터 출력

        System.out.printf("========== 방문록 =========== \n" );
        System.out.printf("%4s %10s %20s %10s \n" , "번호","작성자","내용","날짜");
        System.out.printf("%4s %10s %20s %10s \n" , 1 , 작성자, 내용, 날짜);
        */
        //예제2: 기본급과 수당 정수로 입력받아 실수령액 계산해서 출력
            //실수령액: 기본급 + 수당 - 세금[기본급10%]
        
            //1. 입력
        System.out.println(" 기본급 :"  ); int 기본급 = scanner.nextInt(); //정수로 입력받아 int 기본급으로
        System.out.println(" 수당 : ");   int 수당 = scanner.nextInt();
            //2. 처리
        int 실수령액 = 기본급 + 수당 -(int)(기본급*0.1); // % : 나머지 연산자
            //오류 나는 이유 : int + int - int * double => double 더블은 인트에 저장 불가 저장 하려면 강제 캐스팅 해야한다
                //0.1 double형 이므로 int*double 의 결과는 double
                //그래서 double을 int에 대입할수 없다 -> 강제 캐스팅.
        //3. 출력
        System.out.println("실수령액 = " + 실수령액);
            
        //next nextLine next 띄어쓰기 불가 nextLIne 가능



    } // m e
}// c e
