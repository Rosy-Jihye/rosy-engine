package kosa.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import kosa.io.Member;

//��ȭ��ȣ ����� ����(�߰�, ���, �˻� ���)�ϴ� ���
public class Manager {
	//private PhoneInfo arr[]; //==>List �ڷᱸ���� ����
	List<PhoneInfo>list;
//	private int count; //���° �迭 �ε����� ����ϰ� �ִ���
	private Scanner sc;
	
	public Manager() {
		//arr = new PhoneInfo[10];
		list = new ArrayList<PhoneInfo>();
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
				//arr[count++] = new PhoneInfo(name, phoneNo, birth);
				list.add(new PhoneInfo(name, phoneNo, birth));
				break;

			case "2":
				System.out.print("����: ");
				String major=DataInput.sc.nextLine();
				System.out.print("���: ");
				String year=DataInput.sc.nextLine();
				//arr[count++] = new Universe(name, phoneNo, birth, major, year);
				list.add(new Universe(name, phoneNo, birth, major, year));
				break;

			case "3":
				System.out.print("�μ�: ");
				String dept=DataInput.sc.nextLine();
				System.out.print("����: ");
				String position=DataInput.sc.nextLine();	
				//arr[count++] = new Company(name, phoneNo, birth, dept, position);
				list.add(new Company(name, phoneNo, birth, dept, position));
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
//				for(int i=0;i<count;i++) {
//					arr[i].show();
				Iterator<PhoneInfo> iter = list.iterator(); //����Ʈ ������ ������ ���� �������µ� ������ Ÿ���� Iterator�� �����´�
				while(iter.hasNext()) { //��ȸ�� �� �ȿ� ��� �ִ�?
					iter.next().show(); //�־�. �׷��� ����Ʈ ��ü �������� ����ϴµ� iterator ���� ���� ������ ����.
				}
				break;

			case "2":
				System.out.println("**��â���**");
				for(int i=0;i<list.size();i++) {
					PhoneInfo info = list.get(i);
					if(info instanceof Universe) {
						info.show();
					}
//				for(int i=0;i<count;i++) {
//					if(arr[i] instanceof Universe) {
//						arr[i].show(); //override�� �߱⿡ universe�� show ����
//					}
				}
				break;

			case "3":
				System.out.println("**������**");
				for(int i=0;i<list.size();i++) {
					PhoneInfo info = list.get(i);
					if(info instanceof Company) {
						info.show();
					}
//				for(int i=0;i<count;i++) {
//					if(arr[i] instanceof Company) {
//						arr[i].show(); //override�� �߱⿡ universe�� show ����
//					}
				}
				break;
		}

	}
	
	public void searchPhoneInfo() {
		//�˻��ϰ��� �ϴ� �̸����� 1���� PhoneInfo ��ü�� ������ �˻�
		
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		int idx=-1;
		
//		for(int i=0;i<count;i++) {
//			if(name.equals(arr[i].getName())) {//name�� private�� �Ǿ��־ getName�� �ؾ���.
//			arr[i].show();
//			idx=i;
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {//name�� private�� �Ǿ��־ getName�� �ؾ���.
			list.get(i).show();
			idx=i;
			}
//			}
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
		
//		for(int i=0;i<count;i++) {
//			if(name.equals(arr[i].getName())) {
//				System.out.println("���� ��ȭ��ȣ: ");
//				String phoneNo = DataInput.sc.nextLine();
//				arr[i].setPhoneNo(phoneNo);
//				idx = i;
//			}
		for(int i=0;i<list.size();i++) {
			PhoneInfo info = list.get(i);
			if(name.equals(info.getName())) {
				System.out.println("���� ��ȭ��ȣ: ");
				String phoneNo = DataInput.sc.nextLine();
				info.setPhoneNo(phoneNo);
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
		
//		for(int i=0;i<count;i++) {
//			if(name.equals(arr[i].getName())) {
//				idx = i;
//			}
		for(int i=0;i<list.size();i++) {
			PhoneInfo info = list.get(i);
			if(name.equals(info.getName())) {
				list.remove(info);
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");//idx�� ������ -1�̶�� ã�� �̸��� �������� �ʴ´ٴ� �ǹ�
//		}else {
//			for(int i=idx;i<count;i++) { //���� �������� üũ�ؼ�
//				if(i==arr.length-1) { //�迭�� ���� ������ ����� ��
//					arr[i] = null; //�� ������ �д�
//				}else {
//				arr[i]=arr[i+1]; //�߰��� �� ���� ���� �ʰ� ������ �����.
//				}
//			}
//			count--;
		}
	}
	
	public void saveFile() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("PhoneInfo.txt"));
			oos.writeObject(list);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (Exception e2) {}
		}
	}
	
	public void loadFile() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("PhoneInfo.txt"));
			list = (List)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}
}

