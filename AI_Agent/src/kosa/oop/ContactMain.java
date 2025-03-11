package kosa.oop;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
// ����> ��ȭ��ȣ�� �������α׷� ��������.
//	     ��ȭ��ȣ�� :  �Ѹ��� �̸�, ��ȭ��ȣ, ��������� ���
//	     >1.�߰� 2.��ü��� 3.�˻� 4.����
//	     >�޴�: 1
//	     >�̸� : ȫ�浿
//	     >��ȭ��ȣ : 111-1111
//	     >������� : 20/01/01
//	     >��ȭ��ȣ�� ��� �Ǿ����ϴ�.
//	     >1.�߰� 2.��ü��� 3.�˻� 4.����
//	     >�޴� : 2
//	     >�̸� : ȫ�浿
//	     >��ȭ��ȣ : 111-1111
//	     >������� : 20/01/01
//	     >1.�߰� 2.��ü��� 3.�˻� 4.����
//	     >�޴� : 3
//	     >�˻� �̸� : ȫ�浿
//	     >�̸� : ȫ�浿
//	     >��ȭ��ȣ : 111-1111
//	     >������� : 20/01/01
//	     >1.�߰� 2.��ü��� 3.�˻� 4.����
//	     >�޴� : 4
//	     >���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		Contact arr[] = new Contact[10];
		int count =0;

		
		while(true) {
			
			System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.����");
			System.out.print("�޴�: ");
			int menu=Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1: 
					System.out.print("�̸�: ");
					String name=sc.nextLine();
					System.out.print("��ȭ��ȣ : ");
					String contact=sc.nextLine();
					System.out.print("�������: ");
					String birth=sc.nextLine();
					System.out.print("��ȭ��ȣ�� ��ϵǾ����ϴ�.");
					System.out.println();
					arr[count++]=new Contact(name, contact, birth);
					break;
				case 2:
					for(int i=0;i<count;i++) {
						arr[i].printContact();
					}
					break;
				case 3:
					System.out.print("�˻� �̸� : ");
					String name1=sc.nextLine();
					for(int i=0;i<count;i++) {
						if(name1.equals(arr[i].getName())) {
							arr[i].printContact();
						}
						else {
							System.out.println("�ش� ������ �����ϴ�.");
							}
					}
					break;
				case 4:
					System.out.print("���α׷� ����");
					return;
			
			}
			
		}
		
	}

}
