package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	//������ ���ϴ� �޼���
	public static int sum(int kor, int mat, int eng) {
		int total=kor+mat+eng;
		return total;
	}
	//����� ���ϴ� �޼���
	public static int average(int total) {
		int aver=total/3; //int�� int ������ ������ int ����. �׷��� �Ҽ��� �ȳ���.
		return aver;
	}
	
	public static void main(String[] args) {
		// �������� ����
		// ����, ����, ���� ������ Ű����� �Է� �ް�
		// ������ ����� ����ϼ���.(�� ����� �Ǽ���)
		
			Scanner sc=new Scanner(System.in);
			
			int kor, mat, eng;
			int total;
			int aver;
			
			System.out.println("����: ");
			kor=sc.nextInt();
			System.out.println("����: ");
			mat=sc.nextInt();
			System.out.println("����: ");
			eng=sc.nextInt();
			
//			total=kor+mat+eng;
//			aver=(int)(total/3.0);
			
			total=sum(kor, eng, mat);
			aver=average(total);
			
			
			System.out.println("����: "+total);
			System.out.println("���: "+aver);
			
			//90�̻�=>A
			//80�̻�=>B
			//70�̻�=>C
			//60�̻�=>D
			//60�̸�=>F
			
			
			if (aver>=90)
				System.out.println("���� : A");
			else if (aver>=80)
				System.out.println("���� : B");
			else if (aver>=70)
				System.out.println("���� : C");
			else if (aver>=60)
				System.out.println("���� : D");
			else
				System.out.println("���� : F");
					
					

	}

}
