package kosa.basic;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("�ܹ��� �ݶ� ���� ��Ÿ");
		System.out.print("�޴�����:");
		String menu=sc.nextLine();
		//���� case���� if����->���̽��� ���õǰ� ��Ȯ�� �� ���̽� ����ϴ� ���� ����.
		
		switch (menu) {
		case "�ܹ���":
			System.out.println("�ܹ��� ����");
			break;
		case "�ݶ�":
			System.out.println("�ݶ� ����");
			break;
		case "����":
			System.out.println("���� ����");
			break;
		default:
			System.out.println("��Ÿ ����");
			break;
		}

	}

}
