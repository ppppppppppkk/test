package day18.model.dao;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ExecutionException;

public class MemberDao extends Dao {


    private static MemberDao memberDao = new MemberDao();
    public  static MemberDao getInstance(){return memberDao;}

    //회원가입
    public int signup(MemberDto memberDto){
        try {
            System.out.println(memberDto);
            // 1. sql작성 [변수가 들어갈 자리에는 ? 대체한다.
            String sql = "insert into member(mid, mpw, mphone) values(?,?,?)";
            // 2. sql 기재
            preparedStatement = connection.prepareStatement(sql);
            // ? 매개변수 대입
            preparedStatement.setString(1, memberDto.getMid());
            preparedStatement.setString(2, memberDto.getMpw());
            preparedStatement.setString(3, memberDto.getMphone());
            // 3. sql 실행
            int count = preparedStatement.executeUpdate();
            if (count == 1) {
                return 0;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 4. sql 결과
        // 5. 함수 종료

        return 1;
    }

    public boolean idcheck(String mid){
        try {
            //1. sql작성
            String sql = "select mid from member where mid = ?";
            //2. sql기재한다.
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mid);
            //3. sql실행한다.
            resultSet = preparedStatement.executeQuery();
            //4. sql결과처리
            if (resultSet.next()) {
                return true;    //중복 있음
            }
        }catch (Exception e ){
            System.out.println(e);
        }
        //5. 함수종료


        return false; // 중복없음
    }

    //2. 로그인
    public boolean login(MemberDto memberDto) {
        try {
            System.out.println(memberDto);
            String sql = "select *from member where mid = ? and mpw = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberDto.getMid());
            preparedStatement.setString(2, memberDto.getMpw());

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {return true;}

        }catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }


    //0. 아이디 찾기
    public  int findmno( String mid){
        try {

            String sql = "select mno from member where mid = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mid);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                //
                return resultSet.getInt("mno");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }
}
