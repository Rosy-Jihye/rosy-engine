package kosa.oop;

public class StaticExam {
	//����������̱⿡ �ʱ�ȭ ���ص� ��
	int total;
	//�ʵ�=>�޸� : ��ü����(new) /�ʵ�� ���� �޸𸮰� �����Ǿ ���� ������
	static int grandTotal;
	//��������, static����, Ŭ��������=>Ŭ���� �ε�
	//static�� �޸𸮰� ���� �ϳ� �����Ǿ ���⿡ ������
	//Ŭ���� �ε�(�� 1�� ����) : ���뺯��, Ŭ�����̸�.������ ��
	
	public void add() {
		total+=10;
		grandTotal +=10;
		
	}
	
	public static void add2() {
		//total+=10;//�̷��� �Ǹ� Ŭ������ �ε��� �� ����Ǵµ� total�� �����Ǳ� ���̱⿡ ����
		grandTotal +=10;
	}
	

	public static void main(String[] args) {
		
	add2(); //static�����̱� ������ �� ��ü�� �Լ��� �� �� �ִ�.
	
	}
//		StaticExam se = new StaticExam();
//		se.add();
//		StaticExam se2 = new StaticExam();
//		se2.add();
//		
//		System.out.println("total:"+se.total);
//		System.out.println("grandTotal:"+StaticExam.grandTotal);//
//		
//		System.out.println("total2:"+se2.total);
//		System.out.println("grandTotal:"+StaticExam.grandTotal);
//		
//	}
}
