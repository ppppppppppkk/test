package day02;

import java.util.Arrays;

public class Step2 { //c s
    public static void main(String[] args) { // m s

        int result1 = 10 + 2 + 8;           // 숫자일경우에는 연산
        System.out.println(result1 + "10"); //문자일경우에는 연결 2010

        // 문자열을 기본타입으로 변환
            // - JAVA외 애플리케이션과 통신할때 [메모장, http : hyper text transfor protocol]
            // - 문자열 -> 기본타입( 타입클래스명.parse()]
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

            // 기본타입을 문자열 변환
        String str1 = String.valueOf(10);

        String str2 = 10+"";

        //- 선언된 변수는 해당 중괄호{}블록 내에서만 사용 가능하고 밖에서는 사용할 수 없다.
        int local = 10;

        // 콘솔로 변수값 출력
        System.out.println();
                // System클래스 : 시스템 관련된 클래스 [다양한 메소드와 속성(필드) 제공]
                    //out : 출력 vs in : 입력
                    //System.out vs System.in
                        //println() : 콘솔 출력 후 줄바꿈
                        // print()  : 콘솔 출력
                        // printf() : 콘솔 형식에 맞추어 출력
        System.out.print("출력문구1");
        System.out.print("출력문구2");
        System.out.println("출력문구3");
        System.out.println("출력문구4");
        System.out.printf(" %s \n" , "출력문구 ");

        int valueInt = 123;
        System.out.printf("상품의 가격 : %d원 \n", valueInt);
        System.out.printf("상품의 가격 : %6d원 \n", valueInt);
        System.out.printf("상품의 가격 : %-6d원 \n", valueInt);
        System.out.printf("상품의 가격 : %06d원 \n", valueInt);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f",10, area);


        String name = "홍길동"; String job = "도적";
        System.out.printf("%6d | %-10s | %10s \n" , 1 , name ,job);

        System.out.println();
        System.out.printf("");
        System.out.println("Step2.main"); //현재 함수명 출력
        System.out.println("args = " + Arrays.toString(args)); //매개변수 출력
        System.out.println("job = " + job); //가장 가까운 변수의 값 출력


    } //m e
}// c e
