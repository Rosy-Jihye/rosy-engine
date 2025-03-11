//package kosa.shopping;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// 장바구니 프로그램을 구현하자.
//
//		//장바구니에 여러종류의 상품객체를 담을 수 있다.
//		//프로그램 시작과 함께 상품목록을 먼저 출력한다.
//		//
//		//1.장바구니추가 : 제품번호를 입력해서 제품을 장바구니에 추가한다.
//		//2.장바구니 목록 : 장바구니에 등록된 제품목록을 출력하고 전체 가격을 출력한다.
//		//3.종료 : 프로그램을 종료한다.
//		//
//		//Product : interface  
//		//  - 할인률이 적용된 가격 구현   - discountApply()
//		//  - 상품내역을 출력하는 기능    - show()
//		//  
//		//NoteBook, Phone : class (no, name, price, dc할인률)
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
//			System.out.println("1. 장바구니 추가 2. 장바구니 목록 3. 종료");
//			System.out.println("메뉴입력: ");
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
//				System.out.println("프로그램 종료");
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
