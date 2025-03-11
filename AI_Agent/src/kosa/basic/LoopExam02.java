package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// 중첩 for문을 쓰는 이유
		// 아래와 같이 전체 구구단을 만들 때 for이 중복 되는 것을 방지
//		for(int i=1;i<=9;i++) {
//			System.out.println("2*"+i+"="+(i*2));
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("3*"+i+"="+(i*3));
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("4*"+i+"="+(i*4));
//		}
		
		//중첩 for문을 통해 전체 구구단 출력
//		for(int i=2;i<=9;i++) {//각각의 단
//			for(int j=1;j<=9;j++) {//각단의 내용 출력, 변수는 i와 다르게 해야하기에 j
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=2;j++) {
//				System.out.println("i:"+i+",j: "+j);
//			}
//      }
		
		//퀴즈>4x+5y=60 =>x, y를 구하자(모든 경우수)
		
		for(int x=0;x<=15;x++) {
			for(int y=0;y<=12;y++) {
				if((4*x)+(5*y)==60) {
					System.out.println(x+","+y);
			}
				
			}
		}
	}
}


