package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		//while : �ʱ��->���ǽ�->��ɹ�->������ : ��������
		//1~10���� ��
		//int sum=0;
		//int i=1;
		//while(i<=10) {
		//	sum+=i; //sum=sum+i
		//	i++;
		//}
		
		//System.out.println("1~10���� ��:"+sum);
		
		
		//����>������ 7�� ���
		//7*1=7
		//7*2=14
		//
		//7*9=63
		
		//int i=1;
		//while(i<=9) {
		 //   System.out.println("7*"+i+"="+(7*1));
		//    i++;
	
//for ��: �ʱ��->���ǽ�->��ɹ�->������ : ���� ����
//int sum=0;
//for(int i=1;i<=10;i++) {
//	sum+=i;
//}
//System.out.println("1~10���� ��:"+sum);

		
		//����>1~100���� ���� �� 2�� ����� 3�� ����� �ƴ� ���ڸ� ����Ͻÿ�.
		//for(int i=1;i<=100;i++) {
		//	if((i%2==0||i%3==0))
		//		continue;
		
		//System.out.print(i+",");
		
		//}
		//System.out.println();

		//do~while: ��ɹ��� 1���� �����ؾ��ϴ� ��� (��ȿ�� ���� �Է¹��� �������̸� �� ��ɹ��� ����)
		//Ű����κ��� ���ڸ� �Է¹޾� ������ �Է¹����� ���� �Է���ġ
		Scanner sc = new Scanner(System.in);
//		int n=0;
//		do {
//			System.out.print("�Է�:");
//			n=sc.nextInt();
//		}while(n<0);
//		System.out.println("�Է� ���:"+n);
		
//����>������ ���� 3���� �޾Ƽ� ���� ��ø���� �ʰ� ����ϱ�
//	int n =(int)(Math.random() * 9)+1;//Math.random : 0.0~0.9//�ش� ���� ��� : 1~9
//	System.out.println(n);
	
	int a,b,c;
	a=(int)(Math.random() * 9)+1;

	do {
		b=(int)(Math.random() * 9)+1;
	}while(a==b);

	do {
		c=(int)(Math.random() * 9)+1;
	}while(a==c||b==c);
	
		System.out.println(a+","+b+","+c);
	}
		
		}
		
