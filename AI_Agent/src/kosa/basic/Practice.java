package kosa.basic;

public class Practice {

	public static void main(String[] args) {
		
		int score[][]= {{90,80,70},{50,40,30}};
		
		//과목별 총점
		int korTotal=0;
		int engTotal=0;
		int matTotal=0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0;i<score.length;i++) {
			int sum=0;
			int avg=0;
			
			System.out.print((i+1)+"\t"); //번호 출력하고, 줄바꿈은 나중에 println 에서 할 것임
			for(int j=0;j<score[i].length;j++) { //중첩 for문으로 0,0/0,1/0,2/1,0/1,1~ 순으로 나가면서 더함)
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
