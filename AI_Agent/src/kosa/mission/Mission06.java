package kosa.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// �α��� ������ �����غ���.
		// id, pass Ű����κ��� �Է�
		// ���� m_id, m_pass ��� ��ġ�ϸ� =>�α��� ����
		// id�� ����ġ =>�ش� ���̵� �������� �ʽ��ϴ�.
		// pass�� ����ġ =>��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		
		String m_id = "kosa";
		String m_pass = "1234";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("ID : ");
		String id=sc.nextLine();
		System.out.print("Password : ");
		String pass=sc.nextLine();
				
		
		if(id.trim().equals(m_id)&&pass.trim().equals(m_pass)) {
			System.out.println("�α��� ����");//trim : �յڿ� �ִ� ���鹮�� ��������.
		} else {
			if(!id.equals(m_id)) {
				System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}
//		while(true) {
//			System.out.print("ID : ");
//			String id=sc.nextLine();
//			if(id.equals(m_id)) {
//				System.out.print("Password : ");
//				String pass=sc.nextLine();
//					if(pass.equals(m_pass)) {
//						System.out.println("�α��� ����");
//						break;
//					}else {
//						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
//					}
//			}else {
//				System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
//			}
//			
//		}
		
	}
	
}