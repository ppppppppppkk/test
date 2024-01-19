package 과제1.과제1.과제7.view;

import day12.controller.Membercontroller;
import day12.model.MemberDto;
import day12.view.MainView;

import java.util.Scanner;

public class MemberView {
    private MemberView(){}
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){ return memberView; }

    //1.회원가입 메소드
    Scanner scanner = MainView.getInstance().scanner;
    public void singup(){
        System.out.println("[1]MemberView.singup");
        //1. 입력받는다.
        System.out.println("아이디 입력 :"); String id = scanner.next();
        System.out.println("비번 입력 :");   String pw = scanner.next();
        System.out.println("이름 :");       String name = scanner.next();
        System.out.println("전화번호 :");    String phone = scanner.next();
        //2. 객체화 한다
        MemberDto memberDto = new MemberDto(0,id,pw,name,phone);
        //3. 객체를 컨트롤 전달(매개변수/회원가입 필요한 정보 객체) 후
        // 처리 결과(리턴/회원가입 처리 결과 boolean,byte 개발자 마음)를 받기 이게 객체의 상호작용
        boolean result=
                Membercontroller.getInstance().singup(memberDto);
        //결과에 따른 출력문 만들기
        if (result){
            System.out.println("안내] 회원가입 성공");
        }else{
            System.out.println("안내] 회원가입 실패");
        }
    }

    //2. 로그인 메소드( 로그인 : 데이터 비교하는 작업)

    public void login(){
        System.out.println("[1]MemberView.login");
        Scanner scanner = MainView.getInstance().scanner;
        System.out.println("아이디 입력:"); String id = scanner.next();
        System.out.println("비밀번호 입력:"); String pw = scanner.next();

        //2. 객체 VS 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        //3.컨트롤에게 전달(로그인에 필요한 정보) 전달 하고 결과 받기
        boolean result = Membercontroller.getInstance().login(memberDto);
        System.out.println("[5] result ="+ result);

        //4. 결과에 따른 처리
        if( result){
            System.out.println("안내] 로그인 성공");
            // 로그인 성공시 사용할 서비스의 view 로 이동.
        }else {
            System.out.println("안내] 로그인 실패");
        }

    }

    public void idsearch(){
        System.out.println("[1]MemberView.idsearch");
        Scanner scanner = MainView.getInstance().scanner;
        System.out.println("아이디 입력"); String id = scanner.next();
        System.out.println("전화번호 입력"); String phone = scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setId( id ); memberDto.setPhone(phone);

        String result = Membercontroller.getInstance().idsearch( memberDto );

        System.out.println("[5]result"+result);
        System.out.println("아이디 폰넘버"+"\n"+ id +"\t"+ phone);
    }

    public void pwsearch(){
        System.out.println("[1]MemberView.pwsearch");
        Scanner scanner = MainView.getInstance().scanner;
        System.out.println("아이디 입력"); String id = scanner.next();
        System.out.println("비밀번호 입력"); String pw = scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setPw(pw);

        String result = Membercontroller.getInstance().pwsearch( memberDto );

        System.out.println("[5]result" + result);
        System.out.println("아이디 비번"+"\n"+id+"\t"+pw);




    }
}
