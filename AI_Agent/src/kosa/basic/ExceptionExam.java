package kosa.basic;

public class ExceptionExam {
	
	public static void noEquals(int a, int b)throws Exception {
		if(a==b) {
			throw new Exception("���� �� �ȵ�");
			
		}
	}

	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			noEquals(10,10);
			System.out.println("2");//���ܹ߻��ϸ� �̰��� ��µ��� ���� //���ܰ� �߻����� ������ ���
		} catch (Exception e) {
			System.out.println("3");//���ܰ� ������ catch�� ���� 3 ��µǰ� //���ܰ� ������ catch�� �Ȱ��� 3��µ��� ����
			e.printStackTrace();//�����޽��� ���
		}finally {
			System.out.println("4");//�����ֵ� ���� finally�� ��·�� ���
		}
		System.out.println("5");//try, catch�� ������� 5�� ��� //���� ������ �̻� ������ 5�� ���

	}

}
