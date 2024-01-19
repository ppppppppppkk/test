package 과제1.과제1.과제7.Controller;

import day12.controller.Membercontroller;
import day12.model.MemberDao;
import day12.model.MemberDto;

public class MemberController {
    private void Membercontroller(){}
    private static Membercontroller membercontroller = new Membercontroller();
    public  static Membercontroller getInstance(){ return membercontroller; }

    //1. 회원가입 메소드
    public boolean singup(MemberDto memberDto){
        //컨트롤 처리
        System.out.println("[2]Membercontroller.singup"+memberDto);
        //2. 유효성 검사 처리
        //3. view받은 객체를 DAO에게 전달 후 처리 결과를 받기
        boolean result = MemberDao.getInstance().singup(memberDto);
        return result;


    }// f end


    // + 로그인 했다는 증거. - 로그아웃을 하기전까지.[회원번호 또는 아이디]
    // 로그인상태 필드
    String loginSession = null; //null이면 비로그인 null 대신에 아이디가 있으면 로그인이 되어있다


    //2. 로그인 메소드
    public  boolean login(MemberDto memberDto){
        System.out.println("[2]Membercontroller.login");

        boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("[4] result ="+ result);
        if( result ){
            loginSession = memberDto.getId();
        }
        return result;
    }

    //3. 아이디 찾기
    public String idsearch( MemberDto memberDto) {
        System.out.println("[2]Membercontroller.idsearch");

        String result = MemberDao.getInstance().idsearch(memberDto);

        System.out.println("[4]result = " + result);
        return memberDto.getId() ;
    }

    public  String pwsearch( MemberDto memberDto){
        System.out.println("[2]Membercontroller.pwsearch");

        String result = MemberDao.getInstance().pwsearch(memberDto);

        System.out.println("[4]result ="+result);
        return memberDto.getPw();
    }
}
