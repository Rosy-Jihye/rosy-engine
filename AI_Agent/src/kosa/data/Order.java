package kosa.data;

import java.util.Scanner;

public class Order {
	
	public Order() {}

	public Order(String foodName, int price) {

	}

	public static void main(String[] args) {
		//�Ĵ� �ֹ����� ���α׷� (ť����)
		//1. �ֹ���û  2. �ֹ�ó�� 3. ����� �Ѿ� 4. ����
		//�Է� 1>Food(foodName, price)
        //	Order(Food, amount)���� => �ڷᱸ�� �߰�
		//�Է� 2> �ڷᱸ���� �ִ� �ֹ�ó��(�ֹ��� ���� ���)
		//�Է� 3> �ֹ�ó���� �޴��� ���� �հ����

		Scanner sc = new Scanner(System.in);
		String foodName;
		int price;
		
		System.out.println("1. �ֹ���û  2. �ֹ�ó�� 3. ����� �Ѿ� 4. ����");
		System.out.println("�޴��Է�: ");
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			arr[count++] = new Order(foodName, price);
			break;
			
		case "2":
			
		}
		

		
	}

}
