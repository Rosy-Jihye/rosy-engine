//package kosa.shopping;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// ��ٱ��� ���α׷��� ��������.
//
//		//��ٱ��Ͽ� ���������� ��ǰ��ü�� ���� �� �ִ�.
//		//���α׷� ���۰� �Բ� ��ǰ����� ���� ����Ѵ�.
//		//
//		//1.��ٱ����߰� : ��ǰ��ȣ�� �Է��ؼ� ��ǰ�� ��ٱ��Ͽ� �߰��Ѵ�.
//		//2.��ٱ��� ��� : ��ٱ��Ͽ� ��ϵ� ��ǰ����� ����ϰ� ��ü ������ ����Ѵ�.
//		//3.���� : ���α׷��� �����Ѵ�.
//		//
//		//Product : interface  
//		//  - ���η��� ����� ���� ����   - discountApply()
//		//  - ��ǰ������ ����ϴ� ���    - show()
//		//  
//		//NoteBook, Phone : class (no, name, price, dc���η�)
//		//Cart : class
//		//Main : class
//
//		
//		int no;
//		String name="name";
//		int price=0;
//		int dc=0;
//		
//
//		NoteBook notebook = new NoteBook();
//		Phone phone = new Phone();
//		
//		notebook.show();
//		phone.show();
//
//		
//		Scanner sc = new Scanner(System.in);
//		
//		Manager m= new Manager();
//		
//		while(true) {
//			System.out.println("1. ��ٱ��� �߰� 2. ��ٱ��� ��� 3. ����");
//			System.out.println("�޴��Է�: ");
//			int menu=DataInput.sc.nextInt();
//			
//			switch(menu) {
//			case 1:
//				m.addCart(name, price, dc);
//				break;
//				
//			case 2:
//				m.listCart();
//				break;
//			
//			case 3:
//				System.out.println("���α׷� ����");
//				return;
//			
//				
//			}
//			
//		}		
//		
//
//
//	}
//
//}
