package kosa.baseball;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		BaseBall b = new BaseBall(); //BaseBall�� ������ �� BaseBall Ŭ������ ��
		Scanner sc = new Scanner(System.in);
		
		int strike = 0;
		int ball =0;
		int count =0;//���������� �ʱ�ȭ �ʿ�
		//int inputNum; //�����̽� ���ϰ� �Է��ϰ� ���� ���
		int input[] = new int[3];
		
		do {
			System.out.println("���� ����");
			System.out.println("���� 3�ڸ� �Է� : ");
			for(int i=0;i<3;i++) {
				input[i]=sc.nextInt();
				System.out.print(input[i]);
			}
			
			//for ��ſ� �Ʒ��� ���� �ϸ� �����̽� ���� ����
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
		

		System.out.println(count+"��° �����߽��ϴ�.");
		
	
	}
}
