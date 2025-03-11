package kosa.oop;

public class Book {
	
//	과제>책값을 계산하는 프로그램을 만들어 보자.
//	교재 JAVA, JSP, Oracle 각각 가격이 30000, 20000, 15000 이다.
//	교재 DC는 30000원 이상 25% 할인
//		20000원 이상 20% 할인
//		15000원 이상 15%할인
//
//	결과> Java 교재는 정가는 30000원 할인된 가격은22500원 입니다.
//	JSP 교재는 정가는 20000원 할인된 가격은16000원 입니다.
//	Oracle 교재는 정가는 15000원 할인된 가격은12750원 입니다.
//	총금액: 51250원
//
//	-------------------------------------------------------------------------------
//	객체지향 
//	책값 DC하는 메서드를 구현
//	책값을 출력하는  메서드도 따로 구현 
//
//	객체모델링을 위한 상태와 행동으로 추상화 작업을 수행 한 후
//	상태  ==> 변수
//	행동 ==> 메서드   : 클래스를 완성한다.
	
	//요구분석 공통된 데이터 구조=>
		//필드 : JAVA 이름 & 가격, JSP 이름 & 가격, Oracle 이름 & 가격

	
	//공통된 기능=>
		//메서드 : 30000원 이상 25% 할인, 20000원 이상 20% 할인, 15000원 이상 15% 할인

	
	String bookName;
	int price;
	int dc_price;
	
	public Book() {	}
	
	public Book(String bookName, int price) {
		super();
		this.bookName=bookName;
		this.price=price;
	}
	
	public void discount() {
		if(price>=30000) {
			dc_price=(int)(price*0.75);
		}else if(price>=20000) {
			dc_price=(int)(price*0.80);
		}else if(price>=15000) {
			dc_price=(int)(price*0.85);
		}
	}
	
	public void printBook() {
		System.out.println(bookName+"교재 정가는"+price+"원 할인된 가격은"+dc_price+"원 입니다.");
	}

//	String book;
//	double bookprice;
//	
//	public Book() {}
//	
//	public Book(String book, double bookprice) {
//	this.book=book;
//	this.bookprice=bookprice;
//}
//	
//	
//	public void discount(double bookprcie) {
//		if(bookprcie>=30000) {
//			bookprcie=bookprcie*0.75;
//		}else if(20000<=bookprcie&&bookprcie<30000) {
//			bookprcie=bookprcie*0.8;
//		}else if(15000<=bookprcie&&bookprcie<20000) {
//			bookprcie=bookprcie*0.85;
//		}
//	}
//		
//	
//	public void printBook() {
//		System.out.println(book+"교재는 정가는 "+(int)bookprice+"원. 할인된 가격은 "+(int)bookprice+"원 입니다.");
//		System.out.println(book+"교재는 정가는 "+(int)bookprice+"원. 할인된 가격은 "+(int)bookprice+"원 입니다.");
//		System.out.println(book+"교재는 정가는 "+(int)bookprice+"원. 할인된 가격은 "+(int)bookprice+"원 입니다.");
//		System.out.println("총금액: "+(int)(bookprice+bookprice+bookprice)+"원");
//	}
	
	
}
