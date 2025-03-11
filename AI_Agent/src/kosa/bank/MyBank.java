package kosa.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBank {
	private Customer customers[];//customer 객체를 넣기 위한 배열
	private int customersNum; //count 대신 쓰이는 것
	
	public MyBank() {
		customers=new Customer[10];//이때 배열 생성해서 방을 만들어놓는다.
	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
		//customers 배열에 순차적(customersNum)으로 데이터 넣기
	}
	
	public Customer getCustomer(String id) {
		Customer cust=null;
		for(int i=0;i<customersNum;i++) {
			if(customers[i].getId().equals(id)) {
				//0부터 늘어나는 customers 배열에서 id를 가져와서 넣은 id와 같은지 찾기
			cust=customers[i];
			//customer[i]를 cust에 담기
			break;
			}
		}
		return cust;
		//해당 cust 출력
	
		
	}

	public Customer[] getAllCustomers() {
		Customer newCustomers[]= new Customer[customersNum];
		//customersNum만큼의 방을 만들어서 새로운 배열을 생성
		for(int i=0;i<customersNum;i++) {
			newCustomers[i]=customers[i];
			//customers[i]를 newCustomers에 넣기
		}
		
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		//customers의 0부터 가져와서 newCustomers에 새로 생성할건데 customers에서 customersNum까지 가져올 것이다 
		
		newCustomers=Arrays.copyOf(customers, customersNum);
		return newCustomers;
		
	}
	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

}
