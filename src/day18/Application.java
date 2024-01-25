package day18;

import day18.view.MainView;
import 팀과제.팀과제4.Main;

public class Application {
    public static void main(String[] args) {

      // MainView mainView = new MainView();
      // mainView.run();                  // 인스턴스 메소드 다름

        MainView.getInstance().run(); // 싱글톤

        // MainView.run(); // 정적 메소드

    }

}
/*
-- 다른 클래스내 메소드를 호출하는 방법
-- 외부 클래스내 메소드를 호출하는 방법


 */
