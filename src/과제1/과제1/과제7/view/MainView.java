package 과제1.과제1.과제7.view;


import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        MainView.getInstance().run();
    }
    private MainView() {
        }// 싱글톤 패턴
        private static MainView mainView = new MainView(); // 싱글톤 패턴
        public static MainView getInstance () {
            return mainView;
        } //싱글톤 패턴
        //1.필드
        Scanner scanner = new Scanner(System.in);
        //2.생성자
        //3.메소드

        public void run () {
            while (true) {
                System.out.println("======메인페이지======");
                System.out.println("1.회원가입 | 2. 로그인 | 3. 아이디찾기 | 4.비밀번호 찾기");
                System.out.println("선택>");
                int ch = scanner.nextInt();

                if (ch == 1) { //회원가입 페이지 이동
                   MemberView.getInstance().singup(); //호출

                } else if (ch == 2) { //로그인 페이지 이동
                  MemberView.getInstance().login();
                } else if (ch == 3) {
                   MemberView.getInstance().idsearch();
                } else if (ch == 4) {
                    MemberView.getInstance().pwsearch();
                }

            }// wh e
        }//run e
    }

