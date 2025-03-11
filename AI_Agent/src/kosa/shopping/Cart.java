//package kosa.shopping;
//
//public class Cart implements Product{
//	
//	private int no;
//	private String name;
//	private int price;
//	private int dc;
//	
//
//	public Cart() {}
//
//	public Cart(int no, String name, int price, int dc) {
//		super();
//		this.no = no;
//		this.name = name;
//		this.price = price;
//		this.dc = dc;
//	}
//
//	public int getNo() {
//		return no;
//	}
//
//	public void setNo(int no) {
//		this.no = no;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public int getDc() {
//		return dc;
//	}
//
//	public void setDc(int dc) {
//		this.dc = dc;
//	}
//	
//	@Override
//	
//	public void discountApply() {
//		if (no==1) {
//			System.out.println(50000*(1-(30/100)));
//		}
//		else if(no==2) {
//			System.out.println(30000*(1-(10/100)));			
//		}
//	}
//	
//	@Override
//	public void show() {
//		if (no==1) {
//			System.out.println("번호: "+1);
//			System.out.println("이름: "+"노트북");
//			System.out.println("가격: "+50000);
//			System.out.println("dc할인율: "+30+"%");
//		}
//		else if(no==2) {
//			System.out.println("번호: "+2);
//			System.out.println("이름: "+"핸드폰");
//			System.out.println("가격: "+30000);
//			System.out.println("dc할인율: "+10+"%");
//		}
//	}
//
//
//}
