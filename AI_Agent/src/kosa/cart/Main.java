package kosa.cart;

public class Main {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook("�ƺ�", 1000000);
		Phone phone = new Phone("������", 1200000, "�Ｚ");
		
		Cart cart = new Cart();
		cart.addProduct(nb);
		cart.addProduct(phone);

	}

}
