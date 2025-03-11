package kosa.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBall {

	//내용: 임의의수 3자리의 숫자를 맞추는 게임
	//123=>정답
	//134=>입력
	//1S1B
	//-> 같은자리의 숫자 일치 => 스트라이크 S
	//-> 서로다른자리 숫자 일치 => 볼 B
	//게임의 종료 -> 3Strike
	//
	//1. 중복되지 않는 1-9 난수 3개를 구한다. => 배열
	//2. 키보드로 부터 3개의 숫자를 입력 받는다. => 배열
	//3. 스트라이크, 볼의 갯수를 체크
	//4. 결과 출력
	//5. 8번째 성공
		
		
	//난수를 생성(중복x)
	private int hidden[];
	
	public BaseBall() { //BaseBall 생성자 호출
		hidden = new int[3]; //배열 생성
		hidden[0] = (int)(Math.random()*9)+1;
		do {
			hidden[1] = (int)(Math.random()*9)+1;
		}while(hidden[0]==hidden[1]);
		do {
			hidden[2] = (int)(Math.random()*9)+1;
		}while(hidden[0]==hidden[2]||hidden[1]==hidden[2]);
		
		System.out.println("정답: "+Arrays.toString(hidden));
		
		
	}
	
	//스트라이크 체크
	public int countStrike(int input[]) {
		int strike = 0;
		for(int i=0;i<3;i++) {
			if(hidden[i]==input[i]) {
				strike++; //같은 자루 수가 맞으면 스트라이크 수를 늘린다
			}
		}
		return strike;
	}
	
	
	//볼체크
	public int countBall(int input[]) {
		int ball = 0;
		for(int i=0;i<3;i++) {
			if(hidden[i]==input[(i+1)%3]) ball++;
			if(hidden[i]==input[(i+2)%3]) ball++;
		}
		return ball;
	}
	
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a, b, c;
//		a=(int)(Math.random() * 9)+1;
//		do {
//			b=(int)(Math.random() * 10);
//		}while(a==b);
//		do {
//			c=(int)(Math.random() * 10);
//		}while(a==c||b==c);
//		System.out.println(a+","+b+","+c);
//		
//		
////		do {
////			a = (int)(Math.random()*9)+1;
////			System.out.print(a);
////			b= (int)(Math.random()*10);
////			System.out.print(b);
////			c= (int)(Math.random()*10);
////			System.out.print(c);
////		}while(!(c==b||c==a||b==a));
////		System.out.println();
//		
//		
//		int arr[]= {a,b,c};
//		
//		int d, e, f;
//
//		int strike = 0;
//		int ball = 0;
//		int count =0;
//		
//		
//		while(true) {
//			System.out.print("번호 1: ");
//			d=sc.nextInt();
//			System.out.print("번호 2: ");
//			e=sc.nextInt();
//			System.out.print("번호 3: ");
//			f=sc.nextInt();
//			int arr2[]= {a,b,c};
//			
//			count++;
//			
//			if(arr[0]==d&&arr[1]==e&&arr[2]==f) {
//				System.out.println("3Strike");
//				System.out.println("결과 : "+a+","+b+","+c);
//				System.out.println(count+"번째 성공");
//				break;
//			}else {		
//			
//				if(arr[0]==arr2[0]) {
//					strike += 1;
//				}
//				if(arr[1]==arr2[0]) {
//					ball += 1;
//				}
//				if(arr[2]==arr2[0]) {
//					ball += 1;
//				}
//				if(arr[0]==arr2[1]) {
//					ball += 1;
//				}
//				if(arr[1]==arr2[1]) {
//					strike += 1;
//				}
//				if(arr[2]==arr2[1]) {
//					ball += 1;
//				}
//				if(arr[0]==arr2[2]) {
//					ball += 1;
//				}
//				if(arr[1]==arr2[2]) {
//					ball += 1;
//				}
//				if(arr[2]==arr2[2]) {
//					strike += 1;
//				}
//			
//				System.out.println(strike+"S"+ball+"B");
//			
//		}
//		
//		
//		}
//		sc.close();
}

