package kosa.oop4;

interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("B �޼��� ȣ��");
	}
}

interface AA{
	BB abc(String name);
	//������ Ÿ��+�޼����
}

class BB{
	BB(String name){
		System.out.println("BB ������:"+name);
	}
	//Ŭ������ �ֱ⿡ �̰��� ������ ����
}


public class Main2 {
	public static void main(String[] args) {
		//1. �͸��� Ŭ����
		AA a1 = new AA() {
			
			@Override
			public BB abc(String name) {
				return new BB(name);
			}
		};
		a1.abc("ȫ�浿"); //abc �޼��忡 ȫ�浿 �Է��ϸ� BB�� ���� ���
		
		//2. ���ٽ����� ǥ��
		AA a2= (name)-> new BB(name);
		a2.abc("�ڱ浿");
		
		//3. �ν��Ͻ� ����
		AA a3 = BB::new;
		a3.abc("��浿");
		//BB �����ڿ� name�� ���� �־ ���
		
		
		
		
		
		
		
//		//1. �͸�Ŭ������ �̿��ؼ� abc() �������̵� -> B�� �����ؼ� bcd() ȣ���غ�����.
//		A a = new A() {
//			
//			@Override
//			public void abc() {
//				B b = new B();
//				b.bcd();
//				
//			}
//		};//�͸�Ŭ������ ����
//		
//		a.abc();//abc�� �������̵� �Ǿ��ֱ⿡ bcd�� ȣ��ȴ�
//
//
//		//2. �ش� ������ ���ٽ����� ����
//		A a2 =()->{
//			B b =new B();
//			b.bcd();
//		};
//		
//		a2.abc();
//	
//		//3. �ν��Ͻ� ����
//		B b =new B();
//		A a3 = B::bcd; //b�� bcd�� �����ϰڴ�
//		
//		a3.abc();
	
	

	}

}
