package kosa.order;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	//static 공용변수로 main외에 클래스에서도 사용가능
	//클래스가 처음 로딩될 때 메모리가 올라가기에 new 안해도 됨
	static int totalSales = 0;
	
	//주문요청 메서드
 
	public static void addOrder(LinkedList<Order> list){
		//여기도 받음. 그래서 여기서 수정하면 아래 list에 반영
		//중요!! call by reference
		System.out.print("요리명: ");
		String foodName =sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("수량: ");
		int amount = Integer.parseInt(sc.nextLine());
		
//		Food food = new Food(foodName, price);
//		Order order = new Order(food, amount);
//		list.offer(order);
		list.offer(new Order(new Food(foodName,price),amount)); //중요!!
	
	}
	
	public static void orderService(LinkedList<Order>list) {
		if(!list.isEmpty()) {
			Order order = list.pop();
			order.show();
			totalSales += order.getTotal();
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Order> list = new LinkedList<Order>(); //여기에 있는 list 주소를
//		LinkedList<addOrder> list = new LinkedList<addOrder>();
		
		while(true) {
			System.out.println("1. 주문요청  2. 주문접수 3. 매출액 총액 4. 종료");
			System.out.println("메뉴입력: ");
			String menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			addOrder(list); //여기도 받고
			break;
			
		case "2":
			orderService(list);
			break;
			
		case "3":
			System.out.println("전체 매출액: "+totalSales);
			break;
			
		case "4":
			System.out.println("프로그램 종료");
			return;
		}
		
		}


	}

}
