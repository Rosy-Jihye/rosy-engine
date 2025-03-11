package kosa.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBall {

	//����: �����Ǽ� 3�ڸ��� ���ڸ� ���ߴ� ����
	//123=>����
	//134=>�Է�
	//1S1B
	//-> �����ڸ��� ���� ��ġ => ��Ʈ����ũ S
	//-> ���δٸ��ڸ� ���� ��ġ => �� B
	//������ ���� -> 3Strike
	//
	//1. �ߺ����� �ʴ� 1-9 ���� 3���� ���Ѵ�. => �迭
	//2. Ű����� ���� 3���� ���ڸ� �Է� �޴´�. => �迭
	//3. ��Ʈ����ũ, ���� ������ üũ
	//4. ��� ���
	//5. 8��° ����
		
		
	//������ ����(�ߺ�x)
	private int hidden[];
	
	public BaseBall() { //BaseBall ������ ȣ��
		hidden = new int[3]; //�迭 ����
		hidden[0] = (int)(Math.random()*9)+1;
		do {
			hidden[1] = (int)(Math.random()*9)+1;
		}while(hidden[0]==hidden[1]);
		do {
			hidden[2] = (int)(Math.random()*9)+1;
		}while(hidden[0]==hidden[2]||hidden[1]==hidden[2]);
		
		System.out.println("����: "+Arrays.toString(hidden));
		
		
	}
	
	//��Ʈ����ũ üũ
	public int countStrike(int input[]) {
		int strike = 0;
		for(int i=0;i<3;i++) {
			if(hidden[i]==input[i]) {
				strike++; //���� �ڷ� ���� ������ ��Ʈ����ũ ���� �ø���
			}
		}
		return strike;
	}
	
	
	//��üũ
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
//			System.out.print("��ȣ 1: ");
//			d=sc.nextInt();
//			System.out.print("��ȣ 2: ");
//			e=sc.nextInt();
//			System.out.print("��ȣ 3: ");
//			f=sc.nextInt();
//			int arr2[]= {a,b,c};
//			
//			count++;
//			
//			if(arr[0]==d&&arr[1]==e&&arr[2]==f) {
//				System.out.println("3Strike");
//				System.out.println("��� : "+a+","+b+","+c);
//				System.out.println(count+"��° ����");
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

