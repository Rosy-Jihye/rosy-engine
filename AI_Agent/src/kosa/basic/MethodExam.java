package kosa.basic;

public class MethodExam {

	
		// �޼���or �Լ� ���� in Java
		// ����������, static(���� ����), ������(ex. void : ���ϰ��� ������ �ʿ� x), �޼��� �̸�(�Ķ����: ���)
//		public static void printCharater(char ch, int num) {//�� ù���� �޼����� �ñ״�ó. ������ ��Ḧ �ΰ� ����  ch, num
//			for(int i=1;i<=num;i++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//		
		public static int add(int num1, int num2) {//int�� ���� int ��ġ�ؾ���. 
			int sum = num1+num2;
			return sum;//int�� ���ϰ��� �����ϴ� �Լ��̱⿡ return�� ���������.
		}
		
		
		public static void main(String[] args) {
//			printCharater('#', 10);//ctrl+space�ϸ� �Լ� ��
//			printCharater('?', 10);
//			printCharater('^', 10);
		
		int result=add(10,20); //return���� �ֱ⿡ result �� �� ����
		System.out.println("���:"+result);//retrun���� �ֱ⿡ �̷��� ����� ���� ����
	}

}
