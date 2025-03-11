package kosa.data;

import java.util.Scanner;

public class Order {
	
	public Order() {}

	public Order(String foodName, int price) {

	}

	public static void main(String[] args) {
		//식당 주문관리 프로그램 (큐구조)
		//1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료
		//입력 1>Food(foodName, price)
        //	Order(Food, amount)생성 => 자료구조 추가
		//입력 2> 자료구조에 있는 주문처리(주문된 내용 출력)
		//입력 3> 주문처리된 메뉴에 대한 합계출력

		Scanner sc = new Scanner(System.in);
		String foodName;
		int price;
		
		System.out.println("1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료");
		System.out.println("메뉴입력: ");
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			arr[count++] = new Order(foodName, price);
			break;
			
		case "2":
			
		}
		

		
	}

}
