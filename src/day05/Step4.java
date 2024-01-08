package day05;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //5. int형 데이터를 여러개 저장할 수 있는 배열 선언
        int[] students = new int[0];

        while (true){
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 |4. 분석 | 5.종료");
            System.out.println("----------------------------------------------------");
                //3. 입력
            System.out.println("선택 >"); String ch = scanner.nextLine();
                //4. 경우의 수
            if(ch.equals("1")){
                System.out.println("학생수>");
                String count = scanner.nextLine();
                // while 밖에서 입력받은 수 만큼 배열 선언 => 다른 if{} 에사 사용하기 위해
                // 입력받은(문자 -> 정수 변환) 만큼 배열길이 초기화
                students = new int[Integer.parseInt(count)]; //기존데이터 사라짐

            }else if(ch.equals("2")){
                //6. [1]번에서 입력받은 학생수 만큼 점수를 입력받기.
                for( int i = 0; i<students.length; i++){ //for start
                    System.out.printf("scores[%d]>" , i);
                    // 입력받은 문자열 -> 정수 변환해서 i번째 인덱스에 저장.
                    students[i] = Integer.parseInt(scanner.nextLine() );
                }   // for end
            } else if (ch.equals("3")) {
                //7. 배열내 모든 학생 점수 출력
                for( int i = 0; i<students.length; i++){
                    System.out.printf("scores[%d]: %d \n", i , students[i]); //i번째 인덱스의 값 호출
                }

            } else if( ch.equals("4")){
                //8.
                int max = 0; //임의 최저 점수 대입하고 시작.
                int sum = 0; //총합계
                for ( int i = 0; i <students.length; i++){
                    //만약에 i번쨰 인덱스의 값이 max보다 크면 대입
                    if( students[i] >= max){
                        max = students[i];
                    }
                sum += students[i]; //총합계
                }
                System.out.println("max = " + max);
                //총합계/ 학생수(배열의 길이
                double avg = sum / students.length;
                System.out.printf("avg = %.1f \n" ,avg);

            }else if(ch.equals("5")){
                System.out.println("프로그램 종료");
                break;
            }else {

            }

        }

    }
}
