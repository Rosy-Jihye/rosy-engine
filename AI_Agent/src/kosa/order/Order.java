package kosa.order;

import java.util.Scanner;

public class Order {

	private Food food; //도전!! List로 표현해보기
	private int amount;
	private int total;
	
	public Order() {}
	
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
		this.total = food.getPrice() * amount;
	}
	
	public void show() {
		food.show();
		System.out.println("주문수량: "+amount);
		System.out.println("주문금액: "+total);
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}


}



	