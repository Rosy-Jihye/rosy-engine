package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// ������ �����͸� ��� �׸�, ������ ���� �پ� ex)�ѱ�, ����, ����, �Ҽ���
		// �⺻�� ������ Ÿ��(primitive type)
		// byte, short, int, long=>������
		//float, double=>�Ǽ���
		//char=>������(���� 1��)
		//boolean=>����
		//String=>���ڿ�=>Object Type
		
		int num; //���� ����=>�޸� �Ҵ�
		int arr[]; //�迭 ���� : Object Type(Reference type : ������) *�߿�!!
		
		num=100;//�����ʱ�ȭ
		
		int num2=10;// �޼��� �ȿ� ������ ������ ���ú���(��������)=>�ݵ�� �ʱ�ȭ �� ���
		System.out.println(num2);
		
		int num3=200;//���� ����, �ʱ�ȭ
		System.out.println("����:"+num3);//��ü�� string(���ڿ�)�� ��
		
		//���� ���� �� ���ǻ���
		//������ : Ư������x, ���ڷ� ����x, �����x, �ҹ���ǥ��(but �ռ���� �߰��� �빮��)
		//�⺻���ͷ� : ""(string), true(boolean), 10(int), 3.14(double)
		//�ڹٴ� �����Ͼ���̱⶧���� ������Ÿ�Կ� ����
		
		float num4=3.14f;//casting�� ���ָ�(f�� �ڿ� ���̸�) float ���� *�߿�!!
		
		//casting(����ȯ) : ����
		//byte(1byte) < short(2byte) < int(4byte) < long(8byte) < float(4byte, �Ǽ���) < double(8byte, �Ǽ���) < string
		//���� ���� ū �� ���� ���� ������ �ȵǴµ� ū ���� ���� ������ ���� ����
		//int<==>char
		
		double b=3.14;
		int c=(int)b;  //���� ����ȯ
		System.out.println(c);//������ �ս� �߻�
		
		double e=c; //�Ϲ��� ����ȯ(���� ���� ū ���� ���� ������ �Ϲ��� ����ȯ ����)
		System.out.println(e);
		
		long num5=100L;//�׳� 100�϶��� int�ε�, 100L�� ���̸� long���� ����ȯ��. int�� long���� �۱⿡ �ʼ��� �ƴ�.
		System.out.println(num5);
		
		int num6=010;//�տ� 0�� ���̸� 8������ ��
		System.out.println(num6);

	}

}
