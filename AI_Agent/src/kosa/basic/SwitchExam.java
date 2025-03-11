package kosa.basic;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("햄버거 콜라 피자 기타");
		System.out.print("메뉴선택:");
		String menu=sc.nextLine();
		//언제 case쓸지 if쓸지->케이스가 제시되고 명확할 때 케이스 사용하는 것이 나음.
		
		switch (menu) {
		case "햄버거":
			System.out.println("햄버거 선택");
			break;
		case "콜라":
			System.out.println("콜라 선택");
			break;
		case "피자":
			System.out.println("피자 선택");
			break;
		default:
			System.out.println("기타 선택");
			break;
		}

	}

}
