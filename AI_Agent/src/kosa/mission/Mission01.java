package kosa.mission;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		// 이름, 나이, 주소를 키보드로부터 입력 받아 변수에 초기화 후 출력하기
		//결과>이름: 홍길동
		//		나이: 24
		//		주소 : 서울시 송파구 가락동
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름:");
		String name=sc.nextLine();
		
		System.out.print("나이:");
		int age=Integer.parseInt(sc.nextLine());
		
		System.out.print("주소:");
		String address=sc.nextLine();
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+address);
		

	}

}
