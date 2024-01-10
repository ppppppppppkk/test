package day07;

import java.util.Scanner;

public class Step4 { // c s
    public static void main(String[] args) { // m s

        Scanner scanner = new Scanner(System.in); //입력하기

        String 전화번호부 = "김현수,010-3913-2072\n유재석,010-1234-1234\n강호동,010-7777-7777";
       // Phone[] phoneBook = new Phone[100];

        // 문자열 설계
        // 하나의 여러개 저장하니까. 여러개를 구분하면서 저장해야되니까. 구분자(정해진건 없음 )
        // 1.전화번호부에는 여럿 사람들이 저장되니까. 사람 구분  \n
        // 김현수010-3913-2072유재석010-1234-1234강호동010-7777-7777
        // 김현수010-3913-2072\n유재석010-1234-1234\n강호동010-7777-7777
        // 2. 이름과 전화번호 구분. 상태 구분 ,
        // 김현수,010-3913-2072\n유재석,010-1234-1234\n강호동,010-7777-7777

        while( true ) { // w s

            // 1. 사람 구분[ \n ] 기준으로 분리. [ 3조각 => 배열 ]
            String[] 사람명단 = 전화번호부.split("\n");
            int 인원수 = 사람명단.length;

            System.out.println("============= 전화번호부 =============");

            for (int i = 0; i < 인원수; i++) {
                //2. 한사람씩 필드 구분[ , ] 기준으로 분리 [ 2조각 => 배열 ]
                String[] 사람정보 = 사람명단[i].split(",");
                String 이름 = 사람정보[0];
                String 전화번호 = 사람정보[1];
                System.out.printf("%2d %5s %11s\n", i + 1, 이름, 전화번호);
            } // for end

            System.out.println("1.전화번호등록 2.전화번호삭제 ");
            System.out.print("선택>");
            int ch = scanner.nextInt();

            if (ch == 1) {
                // 1. 저장할 데이터 입력받는다.
                System.out.print("이름:");
                String name = scanner.next();
                System.out.print("전화번호:");
                String phone = scanner.next();
                // 2. 저장한다.
                //   \n하하,010-5525-5454
                String newData = "\n" + name + "," + phone;
                System.out.println(newData);
                // 3. 기존 전화번호부에 연결
                전화번호부 += newData;
                System.out.println(전화번호부);
            } else if (ch == 2) {
                System.out.print("삭제할 순번 : ");
                int dNo = scanner.nextInt();

                전화번호부 = ""; // 전화번호부 초기화.
                for (int i = 0; i < 인원수; i++) {
                    // 제거할 인원 빼고 다시 전화번호부 셋팅.
                    if (i != dNo - 1) { // i번째 인덱스와 입력받은 번호-1 순번과 같으면 찾았다.
                        전화번호부 += i == 인원수 - 1 ? 사람명단[i] : 사람명단[i] + "\n";
                    }
                }
            }


        }
    } // m e
}// c e

/*


    [1.조건]
        - 하나의 클래스(Phone)를 설계해서 여러개의 객체 생성하고 관리하시오.
        - 설계한 클래스(Phone)를 이용하여 배열(phoneBook)을 하나만 선언합니다. 단 배열에 최대 100개의 객체만 저장할수 있습니다.
        Phone[] phoneBook = new Phone[100];

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 객체 생성후 배열에 순서대로 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
            - 삭제된 객체 뒤 로 객체가 있을경우 한칸씩 앞으로 이동하시오.
                예)
                    0(객체A) 1(객체B) 2(객체C) 3(객체D)  4(null)
                        만일 2번 인덱스의 객체 삭제시
                    0(객체A) 1(객체B) 2(객체D) 3(null)   4(null)
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력
            - 단 배열 항목/요소내 객체가 없을경우에만 출력하지 마시오.

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>

 */
