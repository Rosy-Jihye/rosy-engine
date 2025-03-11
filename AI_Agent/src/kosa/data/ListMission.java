package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		//List 자료구조를 활용하여 키보드로부터 문자열을 입력받아 처리하자.
		//1. 데이터추가 2. 데이터 삭제 3. 데이터 출력(for, Iterator) 4. 종료
		
		//내가 쓴 답
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> list = new ArrayList<String>();
//	
//		while(true) {
//		System.out.println("1. 데이터추가 2. 데이터 삭제 3. 데이터 출력 4. 종료");
//		System.out.print("메뉴입력: ");
//		String menu= sc.nextLine();
//
//
//		switch(menu) {
//		case "1":
//			System.out.print("데이터입력: ");
//			String a = sc.nextLine();
//			list.add(a);
//			System.out.println("입력되었습니다.");
//			break;
//
//		case "2":
//			Iterator <String> iter = list.iterator();
//			
//			while(iter.hasNext()) {
//				System.out.print(iter.next()+",");
//			}
//			
//			System.out.println("삭제 데이터: ");
//			String b = sc.nextLine();
//			list.remove(b);
//			break;
//
//		case "3":
//			Collections.sort(list);
//			
//			Iterator <String> iter2 = list.iterator();
//			
//			while(iter2.hasNext()) {
//				System.out.println(iter2.next()+",");
//			}
//			break;	
//			
//		case "4":
//			System.out.println("프로그램 종료");
//			return;
//
//		}	
//		}
		
		//교수님 답안
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
	
		while(true) {
			System.out.println("1. 데이터추가 2. 데이터 삭제 3. 데이터 출력 4. 종료");
			System.out.print("메뉴입력: ");
			String menu= sc.nextLine();
			int idx = -1;


			switch(menu) {
			case "1":
				System.out.print("데이터입력: ");
				list.add(sc.nextLine());
				System.out.println("입력되었습니다.");
				break;
	
			case "2":
				System.out.print("삭제 데이터: ");
				idx = list.indexOf(sc.nextLine()); //indexOf : 넥스트라인의 위치를 알려줌. 그리고 idx 값을 넥스트라인 인덱스와 맞춰줌
				if(idx!=-1) {
					list.remove(idx); //그리고 해당 인덱스 값이 삭제됨
				}else {
					System.out.println("존재하지 않습니다.");
				}
				break;
	
			case "3":
				
	//			for(int i=0;i<list.size();i++) {
	//				System.out.print(list.get(i)+",");
	//			}	
				
				Iterator <String> iter = list.iterator();
				
				while(iter.hasNext()) { 
					System.out.println(iter.next()+","); 
				}
				break;	
				
			case "4":
				System.out.println("프로그램 종료");
				return;
	
			}	
		}

}
}
