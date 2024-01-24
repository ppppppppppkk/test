package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step1 {

    public static void main(String[] args) {

        try {  //만약에 해당 클래스를 못찾았을때 대처
            //1. Class.forName() : 현재 프로젝트내 클래스 찾기 함수
            Class.forName("com.mysql.cj.jdbc.Driver");
            // MYSQL  회사 driver 클래스를 찾기
            //1.cmd 폴더에 mysql 폴더내 cj 폴더내 jdbc 폴더내 driver 존재
            //2. 해당 폴더내 driver클래스를 찾는 과정에서 오류가 발생할수도 있다.
            // - ClassNotFoundException : 클래스를 찾지 못했다는 뜻
        }catch (ClassNotFoundException e ){
            System.out.println("[시스템 오류] : jdbc 드라이버 클래스를 찾지 못함.." + e);
        }
        //2. Connection : DB 연동 인터페이스
            //인터페이스 타입으로 변수선언
       // Connection connection;
            //인터페이스는 스스로 객체를 만들수 없다.[추상]
            //!!! : 구현제(구현객체 - 구현클래스(implements)로 생성된 객체)
            //DriverManager.getConnection("DB서버주소/DB명", "계정명","비밀번호") 연동해서 연동된
        try{ //만약에 해당 연동할 db서버의 정보가 잘못되거나 db서버쪽에 문제가 발생했을때 대처
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5", "root","1234");
            System.out.println("[시스템 정보] : DB서버와 연동 성공");
        }catch (SQLException e){
            System.out.println("[시스템 오류] : mysql 서버와 연동이 실패했습니다");
        }


/*


    // 예외 오류 처리 : 1.일반예외 2. 실행예외
    - 예외/오류가 발생했을때 대처 하기위해.
    1. 일반예외 : 컴파일시 예외 체크 = 컴파일시 예외/오류 발생
        - 자바 외부와 통신하는 클래스들(키보드,DB서버,파일처리등등)
        - 1. Scanner 클래스
        - 2. DAO(Data Access Object) : 주로 DB연동/조작 객체

    2. 실행예외
        - 미리 대처하기 힘듬 - 미리 예외/오류 알고 있는상태 = 경험을 통한 대처

    예외/오류 처리
    - 만약에 예외가 발생할것 같은 코드에 처리
    - 문법
        try{} catch(예외클래스명 변수){}



*/








    }   //m e
}//c e
