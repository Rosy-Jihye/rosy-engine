package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		//메뉴를 선택해서 해당 메뉴에 대한 명령문을 실행해 보자. System.out.println()
		//4번 선택할 때까지 계속 반복 =>return;
		//1. 추가 2. 출력 3. 검색 4. 종료 
		
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.println("1.추가 2. 출력 3. 검색 4. 종료");
		System.out.print("입력:");
		String menu=sc.nextLine(); // int menu=sc.nextInt(); 이렇게 해도 됨

				switch (menu) {
				case "1": // case 1:
					System.out.println("추가메뉴");
					break;
				case "2": // case 2:
					System.out.println("출력메뉴");
					break;
				case "3": // case 3:
					System.out.println("검색메뉴");
					break;
				case "4": // case 4:
					System.out.println("프로그램 종료");
					return;

		}
	}
	}
	}
