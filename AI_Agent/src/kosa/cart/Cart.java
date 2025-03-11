package kosa.cart;

public class Cart {
	private Product arr[];
	private int count;
	
	public Cart() {
		arr = new Product[10];
	}
	
	public void addProduct(Product p) {
		arr[count++] = p;
	}
	
	public void listProduct() {
		for(int i=0;i<count;i++) {
			arr[i].discount();
			arr[i].show();
		}
	}

}
