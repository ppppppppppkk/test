package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends Dao{

    private ArrayList<CategoryDto> categoryDto;

    // 싱글톤
    private BoardDao(){}
    private static BoardDao boardDao = new BoardDao();
    public  static BoardDao getInstance(){ return boardDao; }

    // 카테고리 조회
    public  ArrayList<CategoryDto> categorySearch( ){
        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
        try {
            // 1.sql 작성한다.
            String sql = "select * from category";

            // 2. sql 기재한다.
            preparedStatement = connection.prepareStatement(sql);
            // 3. sql 실행
            resultSet = preparedStatement.executeQuery();



            // 4. sql 결과처리
            while (resultSet.next()){

                CategoryDto categoryDto1 = new CategoryDto();
                categoryDto1.setGno( resultSet.getInt("gno") );
                categoryDto1.setBcategory( resultSet.getString("bcategory") );

                categoryDtos.add(categoryDto1);
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return categoryDtos;
    }

    // 글쓰기
    public int writing(BoardDto boardDto){
        try {
            // 1. sql 작성
            String sql = "insert into board( btitle , bcontent , mno , gno ) values( ? , ? , ? , ?) ";
            // 2. sql 기재
            preparedStatement = connection.prepareStatement(sql);
            // ? 매개변수 대입
            preparedStatement.setString(1, boardDto.getBtitle());
            preparedStatement.setString(2, boardDto.getBcontent());
            preparedStatement.setInt(3, boardDto.getMno() );
            preparedStatement.setInt(4, boardDto.getGno() );
            // 3 실행
            int count = preparedStatement.executeUpdate();
            if (count == 1){return 0;} // 성공
        }catch (Exception e){
            System.out.println(e);
        }

        return 1; // 실패
    }
}