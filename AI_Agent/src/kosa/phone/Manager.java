package kosa.phone;

import java.util.Scanner;

//��ȭ��ȣ ����� ����(�߰�, ���, �˻� ���)�ϴ� ���
public class Manager {
	private PhoneInfo arr[]; //==>List �ڷᱸ���� ����
	private int count; //���° �迭 �ε����� ����ϰ� �ִ���
	private Scanner sc;
	
	public Manager() {
		arr = new PhoneInfo[10];
		sc = new Scanner(System.in);
	}
	
	public void addPhoneInfo() {
		//1. �Ϲ� 2. ��â 3. ����
		
			System.out.println("1. �Ϲ� 2. ��â 3. ����");
			System.out.print("�޴��Է�: ");
			String menu=DataInput.sc.nextLine();
			System.out.print("�̸�: ");
			String name=DataInput.sc.nextLine();
			System.out.print("��ȭ��ȣ: ");
			String phoneNo=DataInput.sc.nextLine();
			System.out.print("�������: ");
			String birth=DataInput.sc.nextLine();
			
			
			switch(menu) {
			case "1":
				arr[count++] = new PhoneInfo(name, phoneNo, birth);
				break;

			case "2":
				System.out.print("����: ");
				String major=DataInput.sc.nextLine();
				System.out.print("���: ");
				String year=DataInput.sc.nextLine();
				arr[count++] = new Universe(name, phoneNo, birth, major, year);
				break;

			case "3":
				System.out.print("�μ�: ");
				String dept=DataInput.sc.nextLine();
				System.out.print("����: ");
				String position=DataInput.sc.nextLine();	
				arr[count++] = new Company(name, phoneNo, birth, dept, position);
				return;
			
			}//Universe�� Company�� ��� Phoneinfo�κ��� ��ӹޱ� ������ �̷��� Phoneinfo Ÿ�� �迭�� ���� �� �ִ�.
			
			System.out.println("��ȭ��ȣ�� ��ϵǾ����ϴ�.");

		
	}
	
	public void listPhoneInfo() {
		//1. ��ü 2. ��â 3. ����
		
			System.out.println("1. ��ü 2. ��â 3. ����");
			System.out.print("�޴��Է�: ");
			String menu=DataInput.sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.println("**��ü���**");
				for(int i=0;i<count;i++) {
					arr[i].show();
				}
				break;

			case "2":
				System.out.println("**��â���**");
				for(int i=0;i<count;i++) {
					if(arr[i] instanceof Universe) {
						arr[i].show(); //override�� �߱⿡ universe�� show ����
					}
				}
				break;

			case "3":
				System.out.println("**������**");
				for(int i=0;i<count;i++) {
					if(arr[i] instanceof Company) {
						arr[i].show(); //override�� �߱⿡ universe�� show ����
					}
				}
				break;
		}

	}
	
	public void searchPhoneInfo() {
		//�˻��ϰ��� �ϴ� �̸����� 1���� PhoneInfo ��ü�� ������ �˻�
		
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		int idx=-1;
		
		for(int i=0;i<count;i++) {
			if(name.equals(arr[i].getName())) {//name�� private�� �Ǿ��־ getName�� �ؾ���.
			arr[i].show();
			idx=i;
			}
		}
		
		if(idx==-1) {
			System.out.println("�������� �ʽ��ϴ�.");
			
		}
	}
	
	public void updatePhoneInfo() {
		//�̸��� �Է� => �ش� PhoneInfo �˻� => ���� ��ȭ��ȣ �Է� =>��ȭ��ȣ ������ �Ϸ�
		System.out.print("�Է� : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			if(name.equals(arr[i].getName())) {
				System.out.println("���� ��ȭ��ȣ: ");
				String phoneNo = DataInput.sc.nextLine();
				arr[i].setPhoneNo(phoneNo);
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");//idx�� ������ -1�̶�� ã�� �̸��� �������� �ʴ´ٴ� �ǹ�
		}
	}
		
	public void deletePhoneInfo() {
		//�̸� �Է�=>�ش� PhoneInfo ��ü �˻�=>�ε��� ã��=>�ش� ��ü ����
		
		System.out.print("�Է� : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			if(name.equals(arr[i].getName())) {
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");//idx�� ������ -1�̶�� ã�� �̸��� �������� �ʴ´ٴ� �ǹ�
		}else {
			for(int i=idx;i<count;i++) { //���� �������� üũ�ؼ�
				if(i==arr.length-1) { //�迭�� ���� ������ ����� ��
					arr[i] = null; //�� ������ �д�
				}else {
				arr[i]=arr[i+1]; //�߰��� �� ���� ���� �ʰ� ������ �����.
				}
			}
			count--;
		}
	}
}

