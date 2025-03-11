package kosa.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBank {
	private Customer customers[];//customer ��ü�� �ֱ� ���� �迭
	private int customersNum; //count ��� ���̴� ��
	
	public MyBank() {
		customers=new Customer[10];//�̶� �迭 �����ؼ� ���� �������´�.
	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
		//customers �迭�� ������(customersNum)���� ������ �ֱ�
	}
	
	public Customer getCustomer(String id) {
		Customer cust=null;
		for(int i=0;i<customersNum;i++) {
			if(customers[i].getId().equals(id)) {
				//0���� �þ�� customers �迭���� id�� �����ͼ� ���� id�� ������ ã��
			cust=customers[i];
			//customer[i]�� cust�� ���
			break;
			}
		}
		return cust;
		//�ش� cust ���
	
		
	}

	public Customer[] getAllCustomers() {
		Customer newCustomers[]= new Customer[customersNum];
		//customersNum��ŭ�� ���� ���� ���ο� �迭�� ����
		for(int i=0;i<customersNum;i++) {
			newCustomers[i]=customers[i];
			//customers[i]�� newCustomers�� �ֱ�
		}
		
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		//customers�� 0���� �����ͼ� newCustomers�� ���� �����Ұǵ� customers���� customersNum���� ������ ���̴� 
		
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
