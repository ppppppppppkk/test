package day05;

public class Step2 { // c s
    public static void main(String[] args) { // m s


        // 배열(array) 타입
            /*
                -변수는 하나의 값만 저장.
                1. 배열 : 연속된 공간에 값을 나열하고 각 값에 인덱스 부여.
                    - 인덱스 : 각 항목(요소)의 값을 호출하거나 저장하는데 사용된다
                2. 특징
                    1. 배열은 같은 타입의 값만 저장
                        int = [ 57,"가"] 불가능.
                    2. 배열의 길이는 선언된 이후 늘리거나 줄일 수 없다.
                        int = [ 57, 62, 34] : 항목/요소를 추가/삭제 할 수 없다.
                3. 선언
                 - 변수선언 타입 변수명;
                 - 배열선언 타입[] 변수명;

                4. 값 목록으로 배열 선언
                    - 배열생성1 : 타입[] 변수명 = { 값0, 값1, 값2, 값3 };
                    - 배열생성2 : 타입[] 변수명 = new 타입[길이];
                    - 초기값 : 정수 0 , 실수 : 0.0 , 논리 fasle, 클래스(String)/인터페이스 null
                5. 배열의 길이를 구하는 속석명
                    - 배열명.length;   : 현재 배열의 길이를 알려준다.

                6. 배열 항목/요소 값 넣기.
                    - 배열명[인덱스] = 새로운 값;
                7. 배열 항목/요소 값 호출.
                    - 배열명[인덱스]
                8. 배열 항목/요소 값 수정.
                    - 배열명[인덱스] = 새로운 값;
                9. 배열 항목/요소 값 삭제 [ 항목/요소 위치 삭제는 없고 초기화 한다.]
                    - 배열명[인덱스] = 각 타입의 초기값

             */

        // 1. 배열 생성/선언 : 여러개 문자열을 저장하는 배열 선언.
        String[] season = { "Spring","summer","fall","winter"};
        // 타입[] 변수명 =  {  값0    , 값1    ,값2    , 값3};
        //           인덱스 : 0    ,   1       ,2      ,3

        // 2. 배열의 각 요소/항목의 값 호출
        System.out.println("season :" + season); // 기본타입(7가지+String)말고 참초타입 호추릿 주소값이 나옴
        System.out.println("season[0] :" + season[0]);  //배열내 0번인덱스 호출
        System.out.println("season[1] :" + season[1]);  //배열내 1번인덱스 호출
        System.out.println("season[2] :" + season[2]);  //배열내 2번 인덱스 호출
        System.out.println("season[3] :" + season[3]);  //배열내 3번 인덱스 호출
      //  System.out.println("season[4] :" + season[4]); //배열 4번 인덱스 없으므로 호출 불가능

        //인덱스 1번 항목 값 변경
        season[1] = "여름";
        System.out.println("season[1] :" + season[1]);

        //인덱스 2번 항목 값 변경
        season[2] = "가을";
        System.out.println("season[2] :" + season[2]);

        //인덱스 3번 항목 값 변경
        season[3] = "겨울";
        System.out.println("season[3] :" + season[3]);


        //for반복문을 이용한 호출
        for(int i = 0; i<season.length; i++){
            // i는 0부터 마지막 인덱스까지 1씩증가해줌.
            System.out.println("season[i] :" + season[i]);
        }

        //int형 83 , 90,  87 정수 저장하는 배열 선언 scores에다가
        int[] scores = {83, 90, 87};
        int sum = 0;
        for( int i = 0; i<3; i++){
            sum += scores[i];
        }
        System.out.println("총합 :" + sum);
        double avg = (double) sum/3;
        System.out.println("평균: "+ avg);



        //new 연산자를 이용한 배열 선언.
        // new 연산자를 사용시 초기값 !! 정수: 0 실수:0.0 논리: false 클래스 : null
        int[] arr1 = new int[3];    //타입[] 변수명 = new 타입[길이]
        for(int i = 0; i<3; i++){
            System.out.printf("arr1[%2d] : %2d, ", i , + arr1[i]);
        }
        System.out.println();

        //배열 항목의 값 변경
        arr1[0] = 10; //0번은 10으로
        arr1[1] = 20;
        arr1[2] = 30;

        for(int i = 0; i<3; i++){
            System.out.printf("arr1[%2d] : %2d, ", i , +arr1[i]);
        }

        //double 연습
        double[] arr2 = new double[3];

        System.out.println();
        for( int i = 0; i<3; i++){
            System.out.printf("arr2[%1d] : %2f, ", i , + arr2[i]);
        }

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for( int i = 0; i<3; i++){
            System.out.printf("arr2[%1d] : %2f, ", i , + arr2[i]);
        }

        String[] arr3 = new String[3];
        System.out.println();
        for( int i = 0; i<3; i++) {
            System.out.printf("arr2[%1d] : %2s, ", i , + arr2[i]);
        }

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";








    } // m e
}// c e
