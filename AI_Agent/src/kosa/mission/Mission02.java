package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	//총점을 구하는 메서드
	public static int sum(int kor, int mat, int eng) {
		int total=kor+mat+eng;
		return total;
	}
	//평균을 구하는 메서드
	public static int average(int total) {
		int aver=total/3; //int랑 int 나누면 무조건 int 나옴. 그래서 소수점 안나옴.
		return aver;
	}
	
	public static void main(String[] args) {
		// 성적관리 구현
		// 국어, 영어, 수학 점수를 키보드로 입력 받고
		// 총점과 평균을 출력하세요.(단 평균은 실수형)
		
			Scanner sc=new Scanner(System.in);
			
			int kor, mat, eng;
			int total;
			int aver;
			
			System.out.println("국어: ");
			kor=sc.nextInt();
			System.out.println("수학: ");
			mat=sc.nextInt();
			System.out.println("영어: ");
			eng=sc.nextInt();
			
//			total=kor+mat+eng;
//			aver=(int)(total/3.0);
			
			total=sum(kor, eng, mat);
			aver=average(total);
			
			
			System.out.println("총점: "+total);
			System.out.println("평균: "+aver);
			
			//90이상=>A
			//80이상=>B
			//70이상=>C
			//60이상=>D
			//60미만=>F
			
			
			if (aver>=90)
				System.out.println("학점 : A");
			else if (aver>=80)
				System.out.println("학점 : B");
			else if (aver>=70)
				System.out.println("학점 : C");
			else if (aver>=60)
				System.out.println("학점 : D");
			else
				System.out.println("학점 : F");
					
					

	}

}
