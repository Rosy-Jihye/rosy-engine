package kosa.baseball;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		BaseBall b = new BaseBall(); //BaseBall이 생성될 때 BaseBall 클래스로 감
		Scanner sc = new Scanner(System.in);
		
		int strike = 0;
		int ball =0;
		int count =0;//지역변수는 초기화 필요
		//int inputNum; //스페이스 안하고 입력하고 싶을 경우
		int input[] = new int[3];
		
		do {
			System.out.println("게임 도전");
			System.out.println("숫자 3자리 입력 : ");
			for(int i=0;i<3;i++) {
				input[i]=sc.nextInt();
				System.out.print(input[i]);
			}
			
			//for 대신에 아래와 같이 하면 스페이스 없이 가능
			//inputNum = sc.nextInt();
			//input[0]=intputNum/100;
			//input[1]=(inputNum/10);%10;
			//input[2]=(inputNum/10);%10;
			
			
			System.out.println();
			
			
		
			strike =b.countStrike(input);
			ball=b.countBall(input);
			System.out.println(strike + "S" + ball + "B");
			count++;
			
			
		}while(strike != 3);
		

		System.out.println(count+"번째 성공했습니다.");
		
	
	}
}
