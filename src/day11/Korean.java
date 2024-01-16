package day11;

public class Korean {// c s

    //1.필드 정적static/인스턴트
        //1. 인스턴스 final 필드
            // - final : 프로그램 실행 도중에 수정 할수 없게 만듬.
            // 1. 필드 선언시 초기값 대입 //2. 생성자에서 초기값 대입
    final String nation = "대한민국";
    final String ssn;
    String name;

    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;
        //- 정적블록
    static{
        EARTH_SURFACE_AREA = 4 * Math.PI *EARTH_RADIUS * EARTH_RADIUS;
    }


    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
    //2.생성자
    //3.메소드 정적static/인스턴트


} // c e
