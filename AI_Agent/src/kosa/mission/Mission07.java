package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// UpDown ���� ��������.
		// ����(����) ���� : 1~100=>1�� ���� ����
		// Ű����κ��� ���� �Է�(1~100) ���� 200�Է��ϸ� �ٽ� �Է¹ް� ����
		// �Է��� ���ڿ� ���� ��
		// ���� =>"�����մϴ�. 3������ ����" ���α׷� ����
		// ���� => Up or Down ���
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int re =r.nextInt(100)+1; // nextInt : ������ 100�ε� 0���� �����ϴ� 1���� 100���� ��
		System.out.println(re);
		int n = 0;
		int count =0;
		
		while(true) {
			do {
				System.out.println("1~100 �����Է�: ");
				n=sc.nextInt();				
			}while(n>100||n<1);
			
			count++;
			
			if(re==n) {
				System.out.println(count+"��° �����߽��ϴ�!");
				break;
			}else if(re<n) {
				System.out.println("DOWN!");
			}else if(re>n) {
				System.out.println("UP!");
			}
			
		}
		
//		
//		do {
//			System.out.print("�Է�: ");
//			int b=sc.nextInt();
//		}while(b<1||b>100);
//		System.out.println("�Է�: "+b);
//			//exceed();
//		
//			if(a>b)
//				System.out.println("Up");
//			if(a<b)
//				System.out.println("Down");
//			if(a==b)
//				System.out.println("�����մϴ�."+count+"������ ����");
//		
		
	}

}
