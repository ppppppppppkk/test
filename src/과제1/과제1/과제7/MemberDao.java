package 과제1.과제1.과제7;

import day12.model.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    private MemberDao() {
    }

    private static MemberDao memberDao = new MemberDao();

    public static MemberDao getInstance() {
        return memberDao;
    }

    //DB 대신 배열로 저장하겠다
    //배열 사용시 불편한점 : 고정길이
    // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리 집합)
    // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
    //1. 회원가입 메소드
    //제공하는 함수
    // 요소 저장 : .add()
    // 요소 개수 : .size()
    // MemberDto[] memberDtos = new MemberDto[100]; //배열 사용
    ArrayList<day12.model.MemberDto> memberDtos = new ArrayList<>();

    public boolean singup(day12.model.MemberDto memberDto) {
        System.out.println("[3]MemberDao.singup");
        memberDtos.add(memberDto);


        //1. 비즈니스로직
      /*
       for( int i = 0; i <memberDtos.length; i++){
           if( memberDtos[i] == null){
               memberDtos[i] = memberDto;
               return true; //회원가입 성공
           }
       */
        //SQL 처리
        return true; //회원가입 성공
    }

    //2. 로그인 메소드


    public boolean login(day12.model.MemberDto memberDto) {
        System.out.println("[3]MemberDao.login");

        //로그인 처리 : 전체 회원객체 중에 입력받은 동일한 값이 있는지 확인
        for (int i = 0; i < memberDtos.size(); i++) {
            //i는 0부터 리스트내 요소 개수 까지 1씩 증가
            if (memberDtos.get(i).getId().equals(memberDto.getId())) {
                //리스트내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                if (memberDtos.get(i).getPw().equals(memberDto.getPw())) {
                    //리스트내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수) 같으면
                    return true; //로그인 성공
                }
            }
        }
        return false;// 로그인 실패

    }

    public String idsearch(day12.model.MemberDto memberDto) {
        System.out.println("[3]MemberDto.idsearch"+memberDto);
        for (int i = 0; i < memberDtos.size(); i++) {
            if (memberDtos.get(i).getId().equals(memberDto.getId())) {
                if (memberDtos.get(i).getPhone().equals(memberDto.getPhone())) {
                    return memberDtos.get(i).getId();

                }
            }
        }
        return "아이디 찾기 실패";
    }
    public String pwsearch(MemberDto memberDto) {
        System.out.println("[3]MemberDto.pwsearch"+memberDto);
        for (int i = 0; i < memberDtos.size(); i++) {
            if (memberDtos.get(i).getPw().equals(memberDto.getPw())) {
                return memberDtos.get(i).getPw();
            }
        }
        return "비밀번호 찾기 실패";
    }
}
