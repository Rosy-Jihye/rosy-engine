package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		//List �ڷᱸ���� Ȱ���Ͽ� Ű����κ��� ���ڿ��� �Է¹޾� ó������.
		//1. �������߰� 2. ������ ���� 3. ������ ���(for, Iterator) 4. ����
		
		//���� �� ��
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> list = new ArrayList<String>();
//	
//		while(true) {
//		System.out.println("1. �������߰� 2. ������ ���� 3. ������ ��� 4. ����");
//		System.out.print("�޴��Է�: ");
//		String menu= sc.nextLine();
//
//
//		switch(menu) {
//		case "1":
//			System.out.print("�������Է�: ");
//			String a = sc.nextLine();
//			list.add(a);
//			System.out.println("�ԷµǾ����ϴ�.");
//			break;
//
//		case "2":
//			Iterator <String> iter = list.iterator();
//			
//			while(iter.hasNext()) {
//				System.out.print(iter.next()+",");
//			}
//			
//			System.out.println("���� ������: ");
//			String b = sc.nextLine();
//			list.remove(b);
//			break;
//
//		case "3":
//			Collections.sort(list);
//			
//			Iterator <String> iter2 = list.iterator();
//			
//			while(iter2.hasNext()) {
//				System.out.println(iter2.next()+",");
//			}
//			break;	
//			
//		case "4":
//			System.out.println("���α׷� ����");
//			return;
//
//		}	
//		}
		
		//������ ���
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
	
		while(true) {
			System.out.println("1. �������߰� 2. ������ ���� 3. ������ ��� 4. ����");
			System.out.print("�޴��Է�: ");
			String menu= sc.nextLine();
			int idx = -1;


			switch(menu) {
			case "1":
				System.out.print("�������Է�: ");
				list.add(sc.nextLine());
				System.out.println("�ԷµǾ����ϴ�.");
				break;
	
			case "2":
				System.out.print("���� ������: ");
				idx = list.indexOf(sc.nextLine()); //indexOf : �ؽ�Ʈ������ ��ġ�� �˷���. �׸��� idx ���� �ؽ�Ʈ���� �ε����� ������
				if(idx!=-1) {
					list.remove(idx); //�׸��� �ش� �ε��� ���� ������
				}else {
					System.out.println("�������� �ʽ��ϴ�.");
				}
				break;
	
			case "3":
				
	//			for(int i=0;i<list.size();i++) {
	//				System.out.print(list.get(i)+",");
	//			}	
				
				Iterator <String> iter = list.iterator();
				
				while(iter.hasNext()) { 
					System.out.println(iter.next()+","); 
				}
				break;	
				
			case "4":
				System.out.println("���α׷� ����");
				return;
	
			}	
		}

}
}
