package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		//�޴��� �����ؼ� �ش� �޴��� ���� ��ɹ��� ������ ����. System.out.println()
		//4�� ������ ������ ��� �ݺ� =>return;
		//1. �߰� 2. ��� 3. �˻� 4. ���� 
		
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.println("1.�߰� 2. ��� 3. �˻� 4. ����");
		System.out.print("�Է�:");
		String menu=sc.nextLine(); // int menu=sc.nextInt(); �̷��� �ص� ��

				switch (menu) {
				case "1": // case 1:
					System.out.println("�߰��޴�");
					break;
				case "2": // case 2:
					System.out.println("��¸޴�");
					break;
				case "3": // case 3:
					System.out.println("�˻��޴�");
					break;
				case "4": // case 4:
					System.out.println("���α׷� ����");
					return;

		}
	}
	}
	}
