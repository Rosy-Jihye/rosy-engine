package kosa.oop;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// 회원가입 프로그램을 구현하자.
		// 회원(이름, 나이) 정보출력
		// 회원 전체 목록 출력
		// private=>set/get 접근
		// 생성자로 초기화 해야한다.

		Scanner sc = new Scanner(System.in);
		Member arr[]= new Member[10];
		int count = 0;
		
		while(true) {
			System.out.print("Name : " );
			String name=sc.nextLine();
			System.out.print("Age : ");
			int age=Integer.parseInt(sc.nextLine());

		
			arr[count++]= new Member(name, age);
			if(count==3) break;
		}
		
		for(int i=0;i<count;i++) {
			arr[i].printMember();
		}
		
//		for(Member m:arr) {
//			m.printMember();
//		}
//		
		//이렇게 하면 배열크기만큼 돌면서 nullpointexception이 발생함.
				

		
	}

}
