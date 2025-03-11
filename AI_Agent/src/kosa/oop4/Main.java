package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		//MyType =>�͸�Ŭ���� �����غ���
		
//		MyType my1 = new MyType() { //�̷� ���´� �߻�Ŭ������ �������̽���.
//			
//			public void hello() {
//				System.out.println("�͸� Ŭ���� ���� �Դϴ�.");
//				
//			}
//		};
//		my1.hello();
		
		//���ٽ�(�Լ��� ���α׷�)���� ����
		//�������̽� �ȿ� �߻� �޼��尡 �ϳ��϶� ����
		MyType my2 = () -> {
			System.out.println("���ٽ� �����Դϴ�.");
		};
		
		my2.hello();
		
		MyType my3 = ()->System.out.println("���ٽ� 2° ����");
		my3.hello();
		
		
		YourType you = (String message)->{
			System.out.println("�޼��� : "+ message);
		};
		you.talk("Hello");
		
		YourType you2 =  message-> System.out.println("�޼��� : "+ message);
		you.talk("�ȳ��ϼ���!");
		
		
		MyNumber my = (x, y) -> (x>y)?x:y;
		System.out.println(my.getMax(10,20));
		
		
		//Runnable => ���ٽ� ǥ��
		Runnable r = ()->{
			//System.out.println("���� ����");
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				}catch (Exception e) {}
				System.out.println(i);
			}
		};
//		r.run();
		Thread t = new Thread(r);
		t.start();
		
		
		
		

	}

}
