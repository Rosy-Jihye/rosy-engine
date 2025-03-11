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
//		System.out.println("번호: ");
//		int no = DataInput.sc.nextInt();
//		arr[count++] = new Cart(no, getName, getPrice, getDc);
//		System.out.println("상품이 장바구니에 추가되었습니다.");
//	
//	}
//	
//	public void listCart() {
//		System.out.println("**장바구니 목록**");
//		for(int i=0;i<count;i++) {
//			arr[i].show();
//		}
//		System.out.println("**전체 가격**");
//		for(int i=0;i<count;i++) {
//			arr[i].discountApply();
//		}
//		
//		
//	}
//	
//}
