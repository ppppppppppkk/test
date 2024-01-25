package day18.view;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

import javax.swing.*;
import javax.swing.text.View;

public class MemberView {

    private MemberView(){};
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){ return  memberView;}

    //1. 회원가입
    public void signup(){
        System.out.println("아이디 :"); String id = MainView.getInstance().scanner.next();
        System.out.println("비밀번호:"); String pw = MainView.getInstance().scanner.next();
        System.out.println("전화번호:"); String phone = MainView.getInstance().scanner.next();

        //2.객체화
        MemberDto memberDto = new MemberDto( id , pw, phone );
        System.out.println(memberDto);

        //3. 컨트롤러 에게 전달
        int result = MemberController.getInstance().signup(memberDto); //샘플 0 : 성공, 1: DB오류 2 : 아이디 중복

        //4.
        if (result == 0){
            System.out.println("<안내> 회원가입 성공");
        }else if( result == 1){
            System.out.println("<안내> 시스템 내부 오류 관리자 에게 문의");
        }else if ( result == 2){
            System.out.println("<안내> 사용중인 아이디 입니다.");
        }
    }
    //2. 로그인

        public void login(){

            //1.입력
            System.out.println("아이디 입력:"); String id = MainView.getInstance().scanner.next();
            System.out.println("패스워드 입력:"); String pw = MainView.getInstance().scanner.next();
            //2.객체화
            MemberDto memberDto = new MemberDto(id,pw);


            //3.전달후 결과
            boolean result = MemberController.getInstance().login(memberDto);

            //4. 결과 출력
            if(result){
                System.out.println("<안내>로그인 성공");
                BoardView.getInstance().run();
            }else{
                System.out.println("<안내>로그인 실패");
            }






        }





}
