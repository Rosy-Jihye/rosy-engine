package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		//while : 초기식->조건식->명령문->증감식 : 수직방향
		//1~10까지 합
		//int sum=0;
		//int i=1;
		//while(i<=10) {
		//	sum+=i; //sum=sum+i
		//	i++;
		//}
		
		//System.out.println("1~10까지 합:"+sum);
		
		
		//퀴즈>구구단 7단 출력
		//7*1=7
		//7*2=14
		//
		//7*9=63
		
		//int i=1;
		//while(i<=9) {
		 //   System.out.println("7*"+i+"="+(7*1));
		//    i++;
	
//for 문: 초기식->조건식->명령문->증감식 : 수평 방향
//int sum=0;
//for(int i=1;i<=10;i++) {
//	sum+=i;
//}
//System.out.println("1~10까지 합:"+sum);

		
		//퀴즈>1~100까지 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
		//for(int i=1;i<=100;i++) {
		//	if((i%2==0||i%3==0))
		//		continue;
		
		//System.out.print(i+",");
		
		//}
		//System.out.println();

		//do~while: 명령문을 1번은 시작해야하는 경우 (유효한 값을 입력받을 때까지이면 이 명령문을 생각)
		//키보드로부터 숫자를 입력받아 음수를 입력받으면 새로 입력조치
		Scanner sc = new Scanner(System.in);
//		int n=0;
//		do {
//			System.out.print("입력:");
//			n=sc.nextInt();
//		}while(n<0);
//		System.out.println("입력 결과:"+n);
		
//퀴즈>임의의 난수 3개를 받아서 서로 중첩되지 않고 출력하기
//	int n =(int)(Math.random() * 9)+1;//Math.random : 0.0~0.9//해당 라인 결과 : 1~9
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
		
