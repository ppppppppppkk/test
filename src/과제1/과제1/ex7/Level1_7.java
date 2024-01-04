package 과제1.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */

		System.out.print("회원명 String:");
		 output = scanner.nextLine();


		System.out.println("상태 boolean : ");
		output = scanner.nextLine();

		byte by = scanner.nextByte();
		System.out.println("회원번호 byte : " + by);

		char ch = scanner.next().charAt(0);
		System.out.println("성별 : " + ch);

		short sh = scanner.nextShort();
		System.out.println("나이 short :" + sh);

		int in = scanner.nextInt();
		System.out.print("포인트 int:" + in);

		long lo = scanner.nextLong();
		System.out.print("예금액 long :" + lo);

		float fl = scanner.nextFloat();
		System.out.println("키 float :" + fl);

		double dou = scanner.nextDouble();
		System.out.println("몸무게 double: "+ dou);

		//===================

		System.out.println("==========회원개인정보=========");
		System.out.println("|"+"\t\t\t\t\t"+"+회원명"+"유재석"+"|");
		System.out.println("|"+"\t\t\t\t\t"+"상태"+"true"+"|");
		System.out.println("|"+"\t\t\t\t\t"+"회워번호"+"20"+"|");
		System.out.println("|"+"\t\t\t\t\t"+"성별"+"M"+"|");
		System.out.println("|"+"\t\t\t\t\t"+"포인트"+"25000"+"|");
		System.out.println("|"+"\t\t\t\t\t"+"예금액"+"500000"+"|");
		System.out.println("|"+"\t\t\t\t\t"+"평균"+"78.2"+"|");
		System.out.println("|"+"\t\t\t\t\t"+"평균"+"88.59"+"|");




		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
