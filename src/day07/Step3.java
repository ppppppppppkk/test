package day07;

public class Step3 {
    public static void main(String[] args) {

        //여러개 자료를 관리하는 방법
            //이름이 '유재석'이고 전화번호가 '010-4334-1344' 이고 나이 '53'일떄
        //1. 변수
        String 이름 = "유재석"; String 전화번호 = "010-3434-3434"; int 나이 = 53;
            //단점 : 인원이 증가하면 그 인워수 만큼의 x3 변수 필요
        //2. 배열
        String[] 이름명단 = {"유재석"};
        String[] 전화번호명단 = {"010-4344-3434"};
        int[] 나이명단 = {53};
            // 주의할점 : 동일한 타입의 데이터들만 나열
        String[] 명단 = {"유재석", "010-3434-3443", "53"};
        //3. 문자열
        String 인원 = "유재석.010-3434-3434";
        String[] 인워명단 = { 인원,인원};
        //여러개의 자료들을 하나의 문자열로 합치기
        // 1. 사람구분 : \n
        // 2. 사람 마다의 정보: ,

        // 4. 클래스 /객체
            //서로 다른 타입들을 하나의 타입 묶음.
    }

}
