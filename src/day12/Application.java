package day12;

import com.sun.tools.javac.Main;
import day12.view.MainView;

//실행 클래스;
public class Application {// c s

    public static void main(String[] args) { // m s
        //다른 클래스의 메소드를 호출하는 방법
       // new MainView().run(); //첫번째 방법          //힙영역 사용

        // 해당메소드가 인스턴스 메소드일경우
        // MainView mainView = new MainView();//두번째 방법
        // mainView.run(); //두번째 방법                //힙영역 사용

        //MainView.run();//세번째 방법 해당 메소드가 정적(static) 메소드 일 경우 힙영역 사용

        MainView.getInstance().run(); //싱글톤 패턴 메소드영역 사용


    }// m e
} // c e





/*
    소프트웨어 개발시 사용되는 디자인패턴 MVC
        MVC: 사용자 인터페이스, 데이터 및 논리제어 구현하는데 있어 사용되는 패턴
        - 관심사 분리 해서 업무의 분리와 향상된 관리
        M : Model   : JAVA,DB       : 데이터 객체
            - DTO 객체 : DATA Transfer Object 이동객체 서로다른 레이어/계층에 이동하는 객체
            - DAO 객체 : DATA Access Object DB접근 객체
            - VO      : Value Object 불변 데이터 객체/수정 금지(Value Object)
        V : view    : HTML,CSS,JS   : (입출력) 구현
        C : control : JAVA,node.js  : MODEL 과  VIEW 중계역할 제어
            JSP( JAVA,HTML)
            REACT( JS,HTML)

*/








