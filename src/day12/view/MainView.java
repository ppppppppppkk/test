package day12.view;

import com.sun.tools.javac.Main;

import java.util.Scanner;

//VRE : 화면구현(입출력)
public class MainView {

    //필드에 본인 객체를 생성한다 private Mainview
     private MainView(){}// 싱글톤 패턴
     private static MainView mainView = new MainView(); // 싱글톤 패턴
     public static MainView getInstance(){return mainView;} //싱글톤 패턴
    //1.필드
    Scanner scanner = new Scanner(System.in);
    //2.생성자
    //3.메소드

    public void run(){
        while (true){
            System.out.println("======메인페이지======");
            System.out.println("1.회원가입 | 2. 로그인");
            System.out.println("선택>");
            int ch = scanner.nextInt();

            if( ch == 1){ //회원가입 페이지 이동
                MemberView.getInstance().singup(); //호출

            }else if( ch == 2){ //로그인 페이지 이동
                MemberView.getInstance().login();
            }

        }// wh e
    }//run e
}// class e
