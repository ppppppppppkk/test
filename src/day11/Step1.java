package day11;

public class Step1 { // c s
    public static void main(String[] args) { // m s

        // 1. 객체 생성
        Korean k1 = new Korean("1234567-123456879","홍길동");
        // 필드 호출
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);
        //3. 필드의 값 수정
       // k1.nation = "USA"; //final 초기화 이후 수정불가
       // k1.ssn = "123-133";
        k1.name = "유재석";

        System.out.println(Korean.EARTH_RADIUS);
        System.out.println(Korean.EARTH_SURFACE_AREA);




    } // m e
} // c e
