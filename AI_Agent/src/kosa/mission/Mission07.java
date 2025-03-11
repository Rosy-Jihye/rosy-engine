package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// UpDown 게임 구현하자.
		// 난수(정답) 생성 : 1~100=>1개 난수 생성
		// 키보드로부터 정수 입력(1~100) 만약 200입력하면 다시 입력받게 설정
		// 입력한 숫자와 난수 비교
		// 정답 =>"축하합니다. 3번만에 성공" 프로그램 종료
		// 오답 => Up or Down 출력
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int re =r.nextInt(100)+1; // nextInt : 범위가 100인데 0부터 시작하니 1부터 100까지 임
		System.out.println(re);
		int n = 0;
		int count =0;
		
		while(true) {
			do {
				System.out.println("1~100 정수입력: ");
				n=sc.nextInt();				
			}while(n>100||n<1);
			
			count++;
			
			if(re==n) {
				System.out.println(count+"번째 성공했습니다!");
				break;
			}else if(re<n) {
				System.out.println("DOWN!");
			}else if(re>n) {
				System.out.println("UP!");
			}
			
		}
		
//		
//		do {
//			System.out.print("입력: ");
//			int b=sc.nextInt();
//		}while(b<1||b>100);
//		System.out.println("입력: "+b);
//			//exceed();
//		
//			if(a>b)
//				System.out.println("Up");
//			if(a<b)
//				System.out.println("Down");
//			if(a==b)
//				System.out.println("축하합니다."+count+"번만에 성공");
//		
		
	}

}
