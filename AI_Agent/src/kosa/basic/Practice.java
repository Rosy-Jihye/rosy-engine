package kosa.basic;

public class Practice {

	public static void main(String[] args) {
		
		int score[][]= {{90,80,70},{50,40,30}};
		
		//���� ����
		int korTotal=0;
		int engTotal=0;
		int matTotal=0;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		
		for(int i=0;i<score.length;i++) {
			int sum=0;
			int avg=0;
			
			System.out.print((i+1)+"\t"); //��ȣ ����ϰ�, �ٹٲ��� ���߿� println ���� �� ����
			for(int j=0;j<score[i].length;j++) { //��ø for������ 0,0/0,1/0,2/1,0/1,1~ ������ �����鼭 ����)
				sum+=score[i][j];
				System.out.print(score[i][j]+"\t");
			}
		
			avg=sum/score[i].length;
			System.out.print(sum+"\t");
			System.out.print(avg+"\t");
			System.out.println();
			
			korTotal+=score[i][0]; //0,0/1,0
			engTotal+=score[i][1]; //0,1/1,1
			matTotal+=score[i][2]; //0,2/1,2
		
		}
		System.out.println("=================");
		System.out.print("\t"+korTotal);
		System.out.print("\t"+engTotal);
		System.out.println("\t"+matTotal);
		
		System.out.print("\t"+korTotal/score.length);
		System.out.print("\t"+engTotal/score.length);
		System.out.println("\t"+matTotal/score.length);

	}
}
