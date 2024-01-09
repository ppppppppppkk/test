package day06;

import java.util.Scanner;

public class Step3 { // c s
    public static void main(String[] args) { // m s

        //1. 문자 추출.charAt(인덱스); 매개변ㅅ: / 리턴값:
        String ssn = "9506241230123";   //문자열
        char sex = ssn.charAt(6);
        switch (sex){ // s s
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        } // s e
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        //문자열에서 문자 색인
        String str = "안녕하세요";
        for(int i = 0; i < str.length(); i++){
            System.out.println( str. charAt(i) );
        }

        //2.문자열 길이 : 문자열.length(); 매개변수 : 없음/ 반환값 : 문자열길이(int)
            //- 공백 포함
        int length = ssn.length();
        if( length == 13 ){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
        //3. 문자열 대체 : 문자열.replace(); 매개변수 : 변경할 문자열 , 새로운 문자열/ 반환값 : 대체된새로운문자열(String)
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newstr =  oldStr.replace("자바","java");
        System.out.println(oldStr);
        System.out.println(newstr);


        // - 특정 불필요한 데이터 대체
        String str1 =  "안녕하세요<br/>유재석";
        String newStr1 =str1.replace("<br/>","n");


        //4. 문자열 잘라내기 : 문자열.subString()
            //매개변수 : (1)    (2) 시작인덱스 , 끝인덱스 /반환타입: 잘라낸 문자열 추출(String)
        String ssn2 ="880815-1234567";
        String firstNum = ssn.substring(0 , 6); //0~5인덱스 추출
        System.out.println("firstNum = " + firstNum);

        String secondNum = ssn.substring(7); //7~ 마지막 인덱스 추출
        System.out.println("secondNum = " + secondNum);

        //5. 문자열 찾기
            //매개변수 : "찾을문자열" /반환값 : 반환타입찬은문자열의인덱스번호(int)

        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String subString = subject.substring(location);
        System.out.println(subString);

        location = subject.indexOf("자바");
        if( location != -1 ){
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련없는 책이군요.");
        }

        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요");
        }else {
            System.out.println("자바와 관련 없는 책이군요");
        }

        //6. 문자열 부닐 : 문자열.split()
            //매개변수 : 구분자// 반환타입 : 배열(문자열[])
        String board = "1.자바 학습, 참조 타입 String을 학습합니다.,홍길동";
        board.split(",");
    } // m e
} // c e
