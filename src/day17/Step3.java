package day17;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DB연동
        //지역변수라 위에서 선언해주자
        Connection connection = null; //try{}와 while{} 모두 선언 먼저 작성

        try {

            //1.jdbc 드라이버 로딩한다
            Class.forName("com.mysql.cj.jdbc.Driver");
            // db서버와 연동 후 연동객체를 반환 받는다.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234"
            );
            System.out.println("DB연동성공");
        }catch ( Exception e ){
            System.out.println(e);
        }

        while (true){
            System.out.println("<고객명단> 1.삽입 2.출력 3.수정 4.삭제");
            System.out.println("선택>");

            try {
                int ch = scanner.nextInt();// 만일 int 타입 범위 벗어난 입력시 오류 발생 InputMismatchException

                if( ch ==1 ){
                    //1. 입력받기
                    System.out.println("저장 고객명"); String name = scanner.next();
                    //2. DB에 저장한다.
                    //connection.prepareStatement("insert into members values('유재석');").executeUpdate();
                    String sql = "insert into members values('"+name+"')";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                } else if (ch == 2) {
                    //조건 없이 모든 출력 , 입력받기x 모든 필드를 표시하는 모든 레코드 출력
                    String sql = "select * from members";
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery(); //executeQuery 질문,조회
                    System.out.println(resultSet); //select 결과물 가지고 있는 인터페이스
                   // resultSet.next(); //next() : 다음레코드로 이동후 존재여부 true/false 반환 함수
                   while ( resultSet.next()){ // 하나씩 next()로 레코드를 이동하면서 반복처리 만약에 다음레코드가 존재하면 실행
                                                // 다음레코드가 존재하지 않으면 false 이므로 while 종료
                       System.out.println( resultSet.getString("name"));
                        //.get타입( 호출 필드번호순서번호 or 필드명);
                   }// while 종료


                } else if (ch == 3) {
                    System.out.println("수정 고객명"); String oldname = scanner.next();
                    System.out.println("새로운 고객명: "); String newName = scanner.next();

                    //String sql = "update members set name = '새로운 고객명' where name = '기존고객명'";
                    String sql = "update members set name = '"+newName+"' where name = '"+oldname+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                } else if (ch == 4) {
                    System.out.println("삭제 고객명"); String deletename = scanner.next();

                    //String deletname = "delete from members where name = '삭제할고객명' ";
                    String sql = "delete from members where name = '"+deletename+"' ";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                }

            }catch(InputMismatchException e){
                System.out.println("<시스템 오류>정상적인 입력값이 아닙니다");
                scanner = new Scanner(System.in); //기존에 입력받은 바이트를 지우기/초기화
            }catch(SQLException e ){
                System.out.println("시스템 오류 SQL문법 오류입니다");
            }


        }//w e
    }//m e
}//m s
