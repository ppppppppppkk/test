package day10;

import java.util.Scanner;

public class BankApplication { //실행 클래스

    // 클래스멤버
    //1. 필드
    static Account[] accounts = new Account[100];
    //2. 생성자
    //3. 메소드
   static Scanner scanner = new Scanner(System.in);
    static void 계좌생성(){
        System.out.print("BankApplication.계좌생성");

        System.out.print("계좌번호 :"); String 계좌번호 = scanner.next();
        System.out.print("계좌주 :"); String 계좌주 = scanner.next();
        System.out.print("초기입금액 :"); int 초기입금액 = scanner.nextInt();

        //2.객체 생성
        Account account = new Account(계좌번호, 계좌주, 초기입금액);

        //3. 배열을 객체에 넣는다
        for ( int i = 0; i < accounts.length; i++){
            if( accounts[i] == null){      //만약에 비어 있으면 객체 저장
                accounts[i] = account;
                break;
            }
        }
    }
        //1. 입력받기

    static void 계좌목록(){
        //배열내 반복문을 이용한 모든 계좌객체를 호출
        for( int i = 0; i< accounts.length; i++){
            Account account = accounts[i];
            if(account != null ){
                System.out.printf("%10s \t %5s \t %10d \n", account.계좌번호, account.계좌주, account.입금액);
            }
        }
    }

    static void 예금(){

        //입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌에 예금에 더한다.
        //1.입력받는다
        System.out.println("예금] 계좌번호 :");       String 계좌번호 = scanner.next();
        System.out.println("예금] 예금액 :");         int 예금액 = scanner.nextInt();
        //2. 계좌목록/배열에서 입력한 계좌를 찾는다
        for(int i = 0; i < accounts.length; i++){
            Account account = accounts[i];
            if( account == null) break;
            if( account.계좌번호.equals( 계좌번호 ) ){
                account.입금액 += 예금액; break;
            }
                // !: 혹시나 해당 i번째 배열에 null이라면 .equals 사용불가
        }
    }

    static void 출금(){
        System.out.println("출금] 계좌번호 :");       String 계좌번호 = scanner.next();
        System.out.println("출금] 출금액 :");         int 출금액 = scanner.nextInt();
        //2. 계좌목록/배열에서 입력한 계좌를 찾는다
        for(int i = 0; i < accounts.length; i++){
            Account account = accounts[i];
            if( account == null) break;
            if( account.계좌번호.equals( 계좌번호 ) ){
                account.입금액 -= 출금액; break;
            }
            // !: 혹시나 해당 i번째 배열에 null이라면 .equals 사용불가
        }

    }
        //1. 실행 시작점.
    public static void main(String[] args) {
        while (true){
            System.out.println("------------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("선택>");

            int ch = scanner.nextInt();

            if( ch == 1){
                계좌생성();

            }else if(ch == 2){
                계좌목록();
            } else if (ch == 3) {
                예금();
            }else if (ch == 4){
                출금();
            } else if (ch == 5 ) {
                System.out.println("프로그램 종료");
                break;
            }
        }// while end
    }// m e
}
