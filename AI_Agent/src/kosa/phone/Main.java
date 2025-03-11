package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		
		Manager m= new Manager(); //생성자 호출-메모지 생성.//하나의 배열에 모든 객체를 넣어야함.
		
		while(true) {
			System.out.println("1. 추가 2. 출력 3. 검색  4. 수정 5. 삭제 6. 종료");
			System.out.print("메뉴입력: ");
			String menu=DataInput.sc.nextLine();
			
			switch(menu) {
			case "1":
				m.addPhoneInfo();
				break;

			case "2":
				m.listPhoneInfo();
				break;

			case "3":
				m.searchPhoneInfo();
				break;	
				
			case "4":
				m.updatePhoneInfo();
				break;	
				
			case "5":
				m.deletePhoneInfo();
				break;	
				
			case "6":
				System.out.println("프로그램 종료");
				return;

				
			}

		}

	}
}


