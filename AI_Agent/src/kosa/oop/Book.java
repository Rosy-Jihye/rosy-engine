package kosa.oop;

public class Book {
	
//	����>å���� ����ϴ� ���α׷��� ����� ����.
//	���� JAVA, JSP, Oracle ���� ������ 30000, 20000, 15000 �̴�.
//	���� DC�� 30000�� �̻� 25% ����
//		20000�� �̻� 20% ����
//		15000�� �̻� 15%����
//
//	���> Java ����� ������ 30000�� ���ε� ������22500�� �Դϴ�.
//	JSP ����� ������ 20000�� ���ε� ������16000�� �Դϴ�.
//	Oracle ����� ������ 15000�� ���ε� ������12750�� �Դϴ�.
//	�ѱݾ�: 51250��
//
//	-------------------------------------------------------------------------------
//	��ü���� 
//	å�� DC�ϴ� �޼��带 ����
//	å���� ����ϴ�  �޼��嵵 ���� ���� 
//
//	��ü�𵨸��� ���� ���¿� �ൿ���� �߻�ȭ �۾��� ���� �� ��
//	����  ==> ����
//	�ൿ ==> �޼���   : Ŭ������ �ϼ��Ѵ�.
	
	//�䱸�м� ����� ������ ����=>
		//�ʵ� : JAVA �̸� & ����, JSP �̸� & ����, Oracle �̸� & ����

	
	//����� ���=>
		//�޼��� : 30000�� �̻� 25% ����, 20000�� �̻� 20% ����, 15000�� �̻� 15% ����

	
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
		System.out.println(bookName+"���� ������"+price+"�� ���ε� ������"+dc_price+"�� �Դϴ�.");
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
//		System.out.println(book+"����� ������ "+(int)bookprice+"��. ���ε� ������ "+(int)bookprice+"�� �Դϴ�.");
//		System.out.println(book+"����� ������ "+(int)bookprice+"��. ���ε� ������ "+(int)bookprice+"�� �Դϴ�.");
//		System.out.println(book+"����� ������ "+(int)bookprice+"��. ���ε� ������ "+(int)bookprice+"�� �Դϴ�.");
//		System.out.println("�ѱݾ�: "+(int)(bookprice+bookprice+bookprice)+"��");
//	}
	
	
}
