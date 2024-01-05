package day04;
import java.util.Scanner;

//무한 루프 활용
public class Step3 { // c s
    public static void main(String[] args) { // m s

        Scanner scanner = new Scanner(System.in);

        boolean run = true;         //무한루프의 상태를 저장하고 있는 변수[on/off]
        int speed = 0;              // 현재 속도를 저장하고 있는 변수[1입력하면 1증가, 2입력하면 1감소
        while (run) { // 무한루프 시작
            System.out.println("-------------------");
            System.out.println(" 1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------");
            System.out.println("선택: ");
            //무한 반복
            String strNum = scanner.nextLine(); //엔터를 입력할때 까지 '대기 상태'
            if( strNum.equals("1")){ //만약에 입력받은 값(문자열) 문자1이면 [문자비교시에는 equals()]
                speed++;
            }else if(strNum.equals("2")){ //만약에 입력받은 값이 문자 2이면
                speed--;
            }else if(strNum.equals("3")){ //만약에 입력받은 값이 문자3이면
                run = false;
                //break;  //가장 가까운 반목문 탈출 키워드
                //return; //현재 함수 종료
            } //if end
        } //무한 루프 끝





    } // m e
}// c e
/*
        무한 루프 = 무한 반복
            - 주의할점 : 무한루프 종료하는 조건은 필수.
         */