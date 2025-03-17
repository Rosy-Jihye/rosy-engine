package kosa.order;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	//static ���뺯���� main�ܿ� Ŭ���������� ��밡��
	//Ŭ������ ó�� �ε��� �� �޸𸮰� �ö󰡱⿡ new ���ص� ��
	static int totalSales = 0;
	
	//�ֹ���û �޼���
 
	public static void addOrder(LinkedList<Order> list){
		//���⵵ ����. �׷��� ���⼭ �����ϸ� �Ʒ� list�� �ݿ�
		//�߿�!! call by reference
		System.out.print("�丮��: ");
		String foodName =sc.nextLine();
		System.out.print("����: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int amount = Integer.parseInt(sc.nextLine());
		
//		Food food = new Food(foodName, price);
//		Order order = new Order(food, amount);
//		list.offer(order);
		list.offer(new Order(new Food(foodName,price),amount)); //�߿�!!
	
	}
	
	public static void orderService(LinkedList<Order>list) {
		if(!list.isEmpty()) {
			Order order = list.pop();
			order.show();
			totalSales += order.getTotal();
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Order> list = new LinkedList<Order>(); //���⿡ �ִ� list �ּҸ�
//		LinkedList<addOrder> list = new LinkedList<addOrder>();
		
		while(true) {
			System.out.println("1. �ֹ���û  2. �ֹ����� 3. ����� �Ѿ� 4. ����");
			System.out.println("�޴��Է�: ");
			String menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			addOrder(list); //���⵵ �ް�
			break;
			
		case "2":
			orderService(list);
			break;
			
		case "3":
			System.out.println("��ü �����: "+totalSales);
			break;
			
		case "4":
			System.out.println("���α׷� ����");
			return;
		}
		
		}


	}

}
