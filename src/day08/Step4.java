package day08;

import java.util.Scanner;

public class Step4 { // c s

    public static void main(String[] args) { // m s

        Scanner scanner = new Scanner(System.in);
        Phone[] phoneBook = new Phone[100]; //1. Phone객체 100개를 저장할 수 있는 phone 배열 선언
            //등록전 : null  null 이 100개 들어있음

        while (true){ // 무한 루프 시작
            for (int i =0 ; i<phoneBook.length; i++){
                if( phoneBook[i] !=null){
                    System.out.printf("%3d \t %5s \t %12s \n", (i+1), phoneBook[i].name, phoneBook[i].number);
                }
            }

            System.out.println("1.등록 2. 삭제 선택>");

            int ch = scanner.nextInt();

            if(ch == 1 ){
                //1.입력받기
                System.out.println("이름 :" );
                String name = scanner.next();
                System.out.println("전화번호 :" );
                String number = scanner.next();
                //2.객체 생성 한다
                    //필드/메소드는 객체가 없으면 사용 불가능.[클래스는 설계도 일뿐이지]
                    //객체 생성할대 필드에 값을 넣을꺼야 말꺼야
                    //1.기본 생성자 사용시
                  //  Phone newphone = new Phone();
                  //  newphone.name = name;
                  //  newphone.number = number;
                        //2. 정의 생성자 사용시
                Phone newphone = new Phone( name, number);
                    //3. PhoneBook배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for ( int i = 0; i<phoneBook.length; i++){
                    if( phoneBook[i] == null){
                        phoneBook[i] = newphone;
                        break;// ! 빈공간을 찾아서 대입은 1번만 대입했으면 반복종료
                    }
                }
            }
            if(ch == 2){

                System.out.println("삭제할 순번:");
                int dNo = scanner.nextInt();
                phoneBook[dNo-1] = null;

                for( int i = dNo-1; i<phoneBook.length; i++){
                    if( i+1 == phoneBook.length ) break;
                    phoneBook[i] = phoneBook[i+1];
                }
            }
        } // 무한 루프 종료




    } // m e
}// c e

/*

메모리 구성
    이름 과 전화번호를 여러개 저장
    멤버 필드(객체의 데이터를 저장하는공간)



 */
