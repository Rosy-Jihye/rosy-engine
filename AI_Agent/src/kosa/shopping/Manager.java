//package kosa.shopping;
//
//import java.util.Scanner;
//
//public class Manager {
//	private Cart arr[];
//	private int count;
//	private Scanner sc;
//	
//	public Manager() {
//		arr = new Cart[10];
//		sc = new Scanner(System.in);
//	}
//	
//
//	public void addCart(String getName, int getPrice, int getDc) {
//		System.out.println("��ȣ: ");
//		int no = DataInput.sc.nextInt();
//		arr[count++] = new Cart(no, getName, getPrice, getDc);
//		System.out.println("��ǰ�� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
//	
//	}
//	
//	public void listCart() {
//		System.out.println("**��ٱ��� ���**");
//		for(int i=0;i<count;i++) {
//			arr[i].show();
//		}
//		System.out.println("**��ü ����**");
//		for(int i=0;i<count;i++) {
//			arr[i].discountApply();
//		}
//		
//		
//	}
//	
//}
