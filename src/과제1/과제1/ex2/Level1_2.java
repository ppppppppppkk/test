package 과제1.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */

		boolean bol1 = true;
		boolean bol2 = false;
		System.out.println("boolean" + "\t\t\t\t\t"+bol1 +"\t\t\t\t\t\t\t"+bol2 );

		byte by1 = 100;
		String by2 = "-128~127";
		System.out.println("byte" +"\t\t\t\t\t" + by1 +"\t\t\t\t\t\t\t" + by2);

		String ch1 = "A";
		String ch2 = "0~65535[character1]";
		System.out.println("char"+"\t\t\t\t\t" + ch1 +"\t\t\t\t\t" + ch2);

		String sh1 = "30000";
		String sh2 = "-32768 ~ 32767";
		System.out.println("short"+"\t\t\t\t\t" + sh1 + "\t\t\t\t\t" + sh2);

		String in1 = "20000000";
		String in2 = "-+2000million";
		System.out.println("int"+"\t\t\t\t\t" + in1 + "\t\t\t\t\t" + in2);

		String lo1 = "400000000";
		String lo2 = "-+2000million Excess";
		System.out.println("long"+"\t\t\t\t\t" + lo1 + "\t\t\t" + lo2);

		String fl1 = "3.124";
		String fl2 = "8 decimal places";
		System.out.println("float"+"\t\t\t\t\t" + fl1 + "\t\t\t\t\t" + fl2);

		String do1 = "3.12312312";
		String do2 = "17 decimal places";
		System.out.println("float"+"\t\t\t\t\t" + do1 + "\t\t\t\t" + do2);

		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
