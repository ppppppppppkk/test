package day18.controller;


import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;

public class MemberController {

    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public  static MemberController getInstance(){return memberController;}

    //1. 회원가입
    public int signup( MemberDto memberDto){
        int result = 0;
        //3. 가공처리/로직
            //1. 만약에 입력받은 아이디의 길이가 8글자 미만이면 실패.
//        if( memberDto.getMid().length() < 8 ){
//            return 3;
//        }
//            //2. 아이디 중복검사
        if(MemberDao.getInstance().idcheck(memberDto.getMid())){
            return 2;
        }

            //회원가입 요청
        result = MemberDao.getInstance().signup(memberDto);
        //2. 반환
     return result;
    }

    //2. 로그인
    int loginMno = 0;
    public boolean login(MemberDto memberDto){
        boolean result = false;
        result = MemberDao.getInstance().login(memberDto);
        //만약에 로그인 성공이면 로그인 상태 변경

        if(result){
            // 로그인 성공한 회원번호 dao 요청
            loginMno = MemberDao.getInstance().findmno(memberDto.getMid() );
        }
        return result;
    }
    //2-2 로그아웃
    public void logout(){
        loginMno = 0;
    }






}
