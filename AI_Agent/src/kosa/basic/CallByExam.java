package kosa.basic;

public class CallByExam {
	
//	public static void change(int num) { //�� �Լ� �ȿ� ���ǵ� ������ �� �ȿ�����
//		num+=10; //num�� 10����
//	}
//
//	public static void main(String[] args) {
//		int num=10;
//		change(num);
//		System.out.println(num);
//
//	}
//�̷��� �ϸ� ����� 10
	
//	public static int change(int num) {
//		num+=10; //num�� 10����
//		return num;//20. �޼ҵ忡 ���ϰ����� �ؾ� �Ʒ� �Լ��� �ݿ��� �� ����
//	}
//
//	public static void main(String[] args) {
//		int num=10;
//		num=change(num);
//		System.out.println(num);

	
	public static int change(int num) {
		num+=10; //num�� 10����
		return num;//20. �޼ҵ忡 ���ϰ����� �ؾ� �Ʒ� �Լ��� �ݿ��� �� ����
	}

	public static void chang2(int brr[]) {//�ּҰ��� brr�� �ο��Ͽ� ���� ���� ������ �� ����.
		brr[0]=200;//brr�� 200���� ����
		//���� arr�� brr�� ���� �ּҸ� ���� �ֱ� ������ ������ �ʿ䰡 ����.
		//�Ʊ�� �������� ������ ���� ������� �ʾұ� ������ ������ ���� ����.
	}
	
	public static void main(String[] args) {
//		int num=10;
//		int num1=change(num);
//		System.out.println(num1);
//	}
	
	int arr[]= {100};
	chang2(arr);//�ּҰ���
	System.out.println(arr[0]);

	
}
}
