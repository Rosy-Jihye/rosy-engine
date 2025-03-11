package kosa.oop;

public class BookMain {

	public static void main(String[] args) {
		
		int total=0;
		
		
		Book arr[]= {
				new Book("Java", 30000),
				new Book("JSP", 20000),
				new Book("Oracle", 15000)				
		};
		
		for(Book b:arr) {
			b.discount();
			b.printBook();
			total+=b.dc_price;
		}
		System.out.println("ÃÑ°¡°Ý: "+total);
		
//		Book b1=new Book("Java", 30000);
//		Book b2=new Book("JSP", 20000);		
//		Book b3=new Book("Oracle", 15000);
//	
//		b1.discount();
//		b2.discount();
//		b3.discount();
//		
//		b1.printBook();
//		b2.printBook();
//		b3.printBook();

	}

}