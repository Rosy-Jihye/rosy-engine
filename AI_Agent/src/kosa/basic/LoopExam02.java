package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// ��ø for���� ���� ����
		// �Ʒ��� ���� ��ü �������� ���� �� for�� �ߺ� �Ǵ� ���� ����
//		for(int i=1;i<=9;i++) {
//			System.out.println("2*"+i+"="+(i*2));
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("3*"+i+"="+(i*3));
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("4*"+i+"="+(i*4));
//		}
		
		//��ø for���� ���� ��ü ������ ���
//		for(int i=2;i<=9;i++) {//������ ��
//			for(int j=1;j<=9;j++) {//������ ���� ���, ������ i�� �ٸ��� �ؾ��ϱ⿡ j
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=2;j++) {
//				System.out.println("i:"+i+",j: "+j);
//			}
//      }
		
		//����>4x+5y=60 =>x, y�� ������(��� ����)
		
		for(int x=0;x<=15;x++) {
			for(int y=0;y<=12;y++) {
				if((4*x)+(5*y)==60) {
					System.out.println(x+","+y);
			}
				
			}
		}
	}
}


