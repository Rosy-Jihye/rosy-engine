package kosa.oop;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
// 문제> 전화번호부 관리프로그램 구현하자.
//	     전화번호부 :  한명의 이름, 전화번호, 생년월일을 출력
//	     >1.추가 2.전체출력 3.검색 4.종료
//	     >메뉴: 1
//	     >이름 : 홍길동
//	     >전화번호 : 111-1111
//	     >생년월일 : 20/01/01
//	     >전화번호가 등록 되었습니다.
//	     >1.추가 2.전체출력 3.검색 4.종료
//	     >메뉴 : 2
//	     >이름 : 홍길동
//	     >전화번호 : 111-1111
//	     >생년월일 : 20/01/01
//	     >1.추가 2.전체출력 3.검색 4.종료
//	     >메뉴 : 3
//	     >검색 이름 : 홍길동
//	     >이름 : 홍길동
//	     >전화번호 : 111-1111
//	     >생년월일 : 20/01/01
//	     >1.추가 2.전체출력 3.검색 4.종료
//	     >메뉴 : 4
//	     >프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		Contact arr[] = new Contact[10];
		int count =0;

		
		while(true) {
			
			System.out.println("1.추가 2.전체출력 3.검색 4.종료");
			System.out.print("메뉴: ");
			int menu=Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1: 
					System.out.print("이름: ");
					String name=sc.nextLine();
					System.out.print("전화번호 : ");
					String contact=sc.nextLine();
					System.out.print("생년월일: ");
					String birth=sc.nextLine();
					System.out.print("전화번호가 등록되었습니다.");
					System.out.println();
					arr[count++]=new Contact(name, contact, birth);
					break;
				case 2:
					for(int i=0;i<count;i++) {
						arr[i].printContact();
					}
					break;
				case 3:
					System.out.print("검색 이름 : ");
					String name1=sc.nextLine();
					for(int i=0;i<count;i++) {
						if(name1.equals(arr[i].getName())) {
							arr[i].printContact();
						}
						else {
							System.out.println("해당 정보가 없습니다.");
							}
					}
					break;
				case 4:
					System.out.print("프로그램 종료");
					return;
			
			}
			
		}
		
	}

}
