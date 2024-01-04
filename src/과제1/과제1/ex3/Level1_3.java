package 과제1.과제1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		scanner.nextLine();
		boolean bool = scanner.nextBoolean();
		System.out.println("input boolean : " + bool);

		scanner.nextByte();
		byte by = scanner.nextByte();
		System.out.println("input byte : " + by);


		char ch = scanner.next().charAt(0);
		System.out.println("input ch : " + ch);

		scanner.nextShort();
		short sh = scanner.nextShort();
		System.out.println("input short :" + sh);

		scanner.nextInt();
		int in = scanner.nextInt();
		System.out.print("input int:" + in);

		scanner.nextLong();
		long lo = scanner.nextLong();
		System.out.print("input long :" + lo);

		scanner.nextFloat();
		float fl = scanner.nextFloat();
		System.out.println("input float :" + fl);

		scanner.nextDouble();
		double dou = scanner.nextDouble();
		System.out.println("input double: "+ dou);
//================================

		boolean bool1 = true;
		System.out.println("output boolean : " + bool1);

		byte by1 = 100;
		System.out.println("output byte : " + by1);

		char ch1 = 'B';
		System.out.println("output ch : " + ch1);

		short sh1 = 30000;
		System.out.println("output short :" + sh1);

		int in1 = 20000000;
		System.out.print("output int:" + in1);

		long lo1 = 20000000;
		System.out.print("output long :" + lo1);

		String fl1 = "3.12312312";
		System.out.println("output float :" + fl1);

		double dou1 = 3.123123123123;
		System.out.println("input double: "+ dou1);



		/* ----------- */
	}
}

/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
