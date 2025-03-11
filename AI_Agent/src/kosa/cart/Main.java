package kosa.cart;

public class Main {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook("¸ÆºÏ", 1000000);
		Phone phone = new Phone("°¶·°½Ã", 1200000, "»ï¼º");
		
		Cart cart = new Cart();
		cart.addProduct(nb);
		cart.addProduct(phone);

	}

}
