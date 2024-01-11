package 과제1.과제1.과제4.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		int[] point = { 97 , 73 ,52 , 76 , 51 };

		/* 문제풀이 위치 */
		int temp = 0; //임시 변수를 만든다
		System.out.print("정렬전:");
		for (int i = 0; i < point.length; i++) { //for문으로 돌리고
			System.out.print(point[i] + ","); // point 출력
		}
		for (int j = 0; j < point.length; j++) {	// j는 0 j point 길이까지 ++증가1
			for (int k = j + 1; k < point.length; k++) {	//k 는 j+1 해주고 포
				if (point[j] > point[k]) {

					temp = point[j]; // temp 임시변수 j번째 주고
					point[j] = point[k]; // j번는 k에게 주고
					point[k] = temp;	//k는 temp에게 주고
				}
			}
		}
		System.out.println();
		System.out.printf("정렬후:");
		for (int i =0; i < point.length; i++) { //for s
			System.out.print(point[i] +",");
		} // for e
		/* ----------- */

	}
}
/* 
	[문제]
		1. int[] point = { 97 , 73 ,52 , 76 , 51 }; int형 배열입니다.
		2. 오림차순으로 정렬하시오.
		3. 정렬 전 과 정렬 후 배열을 그림과 같이 출력하시오.
*/
