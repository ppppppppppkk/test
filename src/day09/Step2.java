package day09;

import day08.Phone;

import java.util.Scanner;

public class Step2 { // c s
    public static void main(String[] args) { // m s

        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[6];


        while (true) { //무한 루프 시작
            for(int i = 0; i<accounts.length; i++) {
                if (accounts[i] != null) {
                    System.out.printf("|" + (i + 1), accounts[i].banknum, accounts[i].name, accounts[i].startmoney);
                }
                System.out.println("--------------------------------------------------");
                System.out.println("1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
                System.out.println("--------------------------------------------------");
                System.out.println("선택>");

                int ch = scanner.nextInt();


                if (ch == 1) {
                    System.out.println("계좌생성");
                    System.out.println("--------");
                    System.out.println("계좌번호 :");
                    String banknum = scanner.next();
                    System.out.println("계좌주 :");
                    String name = scanner.next();
                    System.out.println("초기입금액 :");
                    String startmoney = scanner.next();

                    Account newaccounts = new Account(banknum, name, startmoney);


                } else if (ch == 2) {
                    for (int j = 0; j < accounts.length; j++) {
                        if (accounts[i] == null) {


                        } else if (ch == 3) {

                        } else if (ch == 4) {

                        } else if (ch == 5) {
                            System.out.println("프로그램 종료");
                            break;
                        }
                    }
                }
            }
        }   //무한 루프 종료.
    } // m e
}// c e
