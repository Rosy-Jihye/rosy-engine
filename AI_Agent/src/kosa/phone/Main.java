package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		
		Manager m= new Manager(); //생성자 호출-메모지 생성.//하나의 배열에 모든 객체를 넣어야함.
		
		while(true) {
			System.out.println("1. 추가 2. 출력 3. 검색  4. 수정 5. 삭제 6. 저장 7. 불러오기  8.종료"); //6 ,7 없을 때는 프로그램을 종료하면 데이터가 사라지는데 6. arraylist 파일로 저장 7. 파일 불러오기
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
				m.saveFile();
				break;	
				
			case "7":
				m.loadFile();
				break;	
				
			case "8":
				System.out.println("프로그램 종료");
				return;

				
			}

		}

	}
}


