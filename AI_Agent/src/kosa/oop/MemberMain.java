package kosa.oop;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// ȸ������ ���α׷��� ��������.
		// ȸ��(�̸�, ����) �������
		// ȸ�� ��ü ��� ���
		// private=>set/get ����
		// �����ڷ� �ʱ�ȭ �ؾ��Ѵ�.

		Scanner sc = new Scanner(System.in);
		Member arr[]= new Member[10];
		int count = 0;
		
		while(true) {
			System.out.print("Name : " );
			String name=sc.nextLine();
			System.out.print("Age : ");
			int age=Integer.parseInt(sc.nextLine());

		
			arr[count++]= new Member(name, age);
			if(count==3) break;
		}
		
		for(int i=0;i<count;i++) {
			arr[i].printMember();
		}
		
//		for(Member m:arr) {
//			m.printMember();
//		}
//		
		//�̷��� �ϸ� �迭ũ�⸸ŭ ���鼭 nullpointexception�� �߻���.
				

		
	}

}
