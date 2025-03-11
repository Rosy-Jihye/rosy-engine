package kosa.basic;

public class MethodExam {

	
		// 메서드or 함수 정의 in Java
		// 접근제어자, static(생략 가능), 리턴형(ex. void : 리턴값을 보여줄 필요 x), 메서드 이름(파라미터: 재료)
//		public static void printCharater(char ch, int num) {//이 첫줄을 메서드의 시그니처. 지금은 재료를 두개 넣음  ch, num
//			for(int i=1;i<=num;i++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//		
		public static int add(int num1, int num2) {//int와 리턴 int 일치해야함. 
			int sum = num1+num2;
			return sum;//int는 리턴값을 내야하는 함수이기에 return을 적어줘야함.
		}
		
		
		public static void main(String[] args) {
//			printCharater('#', 10);//ctrl+space하면 함수 뜸
//			printCharater('?', 10);
//			printCharater('^', 10);
		
		int result=add(10,20); //return값이 있기에 result 쓸 수 있음
		System.out.println("결과:"+result);//retrun값이 있기에 이렇게 출력할 수도 있음
	}

}
