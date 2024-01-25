package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    public Connection connection;  //여러 메소드 에서 사용할려고,
    public PreparedStatement preparedStatement; // 작성된 SQL 가지고 있고, 실행담당
    public ResultSet resultSet;
    //싱글톤
    public Dao(){ // 생성자 : 객체 생성시 초기화 담당
        // - 객체 생성시 db 연동.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 연동된 결과의 (구현체) 객체를 Connection인터페이스에 대입한다.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java", "root", "1234"
            );
            System.out.println("DB연동 성공");
        }catch (Exception e){System.out.println("DB 연동실패"+e);}
    }


}
/*
        접근제한자
        public      : 모든 패키지 접근 가능
        private     : 현재 클래스 접근 가능
        protected   : 동일 패키지 접근 가능 + 상속관계 기능
        default     : 동일 패키지 접근 가능

 */