package 과제1.과제1.과제2.ex1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level2_1 {

	public static void main(String[] args) {
		System.out.println(" >> Level2_1 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() + " >> \n");
		Scanner scanner = new Scanner(System.in);


		while (true) {
			System.out.print(" 음악 재생 중 종료버튼[x] : ");
			char btn = scanner.next().charAt(0);

			/* 문제풀이 위치 */

			if (btn == 'x') {
				System.out.println(">> 음악종료");
				break;

				/* ----------- */
			}

		}
	}
}
