package 과제1.과제1.과제4.ex4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_4 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_4 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		String[] X_AXIS = new String[5];
		int x = 0;
		X_AXIS[ x ] = "★";

		while ( true ) {
			/* 문제풀이 위치 */
			for (int i = 0; i < X_AXIS.length; i++) {
				System.out.print(X_AXIS[i] + ",");
			}
			System.out.print("1. 전진 2. 후진선택>");

			int no = scanner.nextInt();
			if( no == 2) {
				String temp = X_AXIS[0];
				for (int i = 0; i < X_AXIS.length - 1; i++) {
					X_AXIS[i] = X_AXIS[i + 1];
				}
				X_AXIS[X_AXIS.length - 1] = temp;
			} else if (no == 1) {

				String temp = X_AXIS[X_AXIS.length - 1];
				for (int i = X_AXIS.length - 1; i > 0; i--) {
					X_AXIS[i] = X_AXIS[i - 1];
				}
				X_AXIS[0] = temp;
			}
			/* ----------- */
		}
	}
}
/* 
	[문제]
		1. String[] X_AXIS = new String[5]; : 문자열 배열 입니다.

		2. 기능선택
			1 입력시 별이 왼쪽으로 이동
			2 입력시 별이 오른쪽으로 이동
			- 만일 배열의 길이보다 벗어나면 최소 또는 최대 위치로 지정하시오.

		3. 그림과 배열의 항목/요소 들을 모두 출력하시오.

		4. 아래 변수들을 활용하시오.
			String[] X_AXIS = new String[5];
			int x = 0;
			X_AXIS[ x ] = "★";
*/
