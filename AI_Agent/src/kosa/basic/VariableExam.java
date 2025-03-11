package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수는 데이터를 담는 그릇, 데이터 종류 다양 ex)한글, 영문, 숫자, 소수점
		// 기본형 데이터 타입(primitive type)
		// byte, short, int, long=>정수형
		//float, double=>실수형
		//char=>문자형(문자 1개)
		//boolean=>논리형
		//String=>문자열=>Object Type
		
		int num; //변수 선언=>메모리 할당
		int arr[]; //배열 선언 : Object Type(Reference type : 참조형) *중요!!
		
		num=100;//변수초기화
		
		int num2=10;// 메서드 안에 선연된 변수를 로컬변수(지역변수)=>반드시 초기화 후 사용
		System.out.println(num2);
		
		int num3=200;//변수 선언, 초기화
		System.out.println("숫자:"+num3);//전체가 string(문자열)로 됨
		
		//변수 선언 시 유의사항
		//변수명 : 특수문자x, 숫자로 시작x, 예약어x, 소문자표현(but 합성어는 중간에 대문자)
		//기본리터럴 : ""(string), true(boolean), 10(int), 3.14(double)
		//자바는 컴파일언어이기때문에 데이터타입에 엄격
		
		float num4=3.14f;//casting을 해주면(f를 뒤에 붙이면) float 가능 *중요!!
		
		//casting(형변환) : 기준
		//byte(1byte) < short(2byte) < int(4byte) < long(8byte) < float(4byte, 실수형) < double(8byte, 실수형) < string
		//작은 것이 큰 곳 가는 것은 문제가 안되는데 큰 것이 작은 곳으로 가면 문제
		//int<==>char
		
		double b=3.14;
		int c=(int)b;  //강제 형변환
		System.out.println(c);//데이터 손실 발생
		
		double e=c; //암묵적 형변환(작은 것을 큰 곳에 놓기 때문에 암묵적 형변환 가능)
		System.out.println(e);
		
		long num5=100L;//그냥 100일때는 int인데, 100L을 붙이면 long으로 형변환함. int가 long보다 작기에 필수는 아님.
		System.out.println(num5);
		
		int num6=010;//앞에 0을 붙이면 8진수로 됨
		System.out.println(num6);

	}

}
