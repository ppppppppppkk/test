package day05;

import java.util.Scanner;

public class Step3 { // c s
    public static void main(String[] args) { // m s

        Scanner scanner = new Scanner(System.in); //입력받은 객체 생성
        //5-1 저장할 (배열)변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[]  패스워드배열 = new int[3];

        //1. 무한루프
        while(true){// 무한루프 시작
            //2. 출력
            System.out.println("=============방문록===========");
            System.out.println("1.방문록작성 2.방문록삭제 3.종료");
            //7. for문 이용한 배열내 모슨 항목/요소 호출 : 0부터 2까지 1씩 증가, 나머지는 코드가 반복되네
            for( int i = 0; i<내용배열.length; i++){ // for start
                //타입은 클래스이지만. null 비교시에는 비교연산자 사용
               // if(내용배열[i] != null)
                System.out.printf("%2d \t %-5s \t %-20s \n", i+1, 작성자배열[i],내용배열[i] );
            } //for end

            //3. 입력
            System.out.println("선택 > "); int ch = scanner.nextInt();

            //4. 입력된 경우의 수 판단
            if( ch == 1){
                //6-1 방문록 작성할 위치[인덱스] 입력받는다
                System.out.print("방문록 작성위치 : 1. 2. 3. :");
                int no = scanner.nextInt();
                //6-2 입력 : 내용, 작성자, 비밀번호
                scanner.nextLine();
                System.out.print("내용 :"); String content = scanner.nextLine();
                System.out.print("작성자 :"); String writer = scanner.next();
                System.out.print("비밀번호 :"); int password = scanner.nextInt();
                //6-3 배열에 각각 대입하기.
                내용배열[ no-1 ] = content;
                작성자배열 [ no-1 ] = writer;
                패스워드배열 [ no-1 ] = password;

            }else if( ch == 2){
                //8-1 입력 : 삭제할 방문록의 위치(인덱스)
                System.out.print("방문록 삭제위치 : 1. 2. 3. :");
                int no = scanner.nextInt();
                //8-2 입력 : 유호성 검사를 위한 비밀번호 입력
                System.out.println("방문록 비밀번호: ");
                int password = scanner.nextInt();
                //8-3 초기화 : 만약에 인덱스가 없는 번호를 선택했을때.
                if( no < 1 || no > 내용배열.length){ //이거나
                    System.out.println("[경고] 알수없는 위치 입니다.");
                }
                    //만약에 선택한 방문록의 패스워드와 방금 입력한 패스워드와 같으면
                else if( 패스워드배열[no-1] == password ){
                    //배열의 항목/요소의 자리/길이 삭제할수 없으므로 초기값으로 대입.
                    내용배열[no-1] = null; 작성자배열[no-1] = null; 패스워드배열[no-1] = 0;
                }else{
                    System.out.println("[경고] 패스워드가 다릅니다");
                }

            }else if( ch == 3){
                break; //함수 종료
            }else{
                System.out.println("[경고]알수없는 입력입니다!");
            }



        }// 무한루프 종료


    } // m e
} // c s
