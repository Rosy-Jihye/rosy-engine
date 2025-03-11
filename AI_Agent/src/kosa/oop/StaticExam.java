package kosa.oop;

public class StaticExam {
	//멤버변수들이기에 초기화 안해도 됨
	int total;
	//필드=>메모리 : 객체생성(new) /필드는 각각 메모리가 생성되어서 각각 더해짐
	static int grandTotal;
	//정적변수, static변수, 클래스변수=>클래스 로딩
	//static은 메모리가 여기 하나 생성되어서 여기에 더해짐
	//클래스 로딩(단 1번 생성) : 공용변수, 클래스이름.변수로 씀
	
	public void add() {
		total+=10;
		grandTotal +=10;
		
	}
	
	public static void add2() {
		//total+=10;//이렇게 되면 클래스가 로딩될 때 실행되는데 total은 생성되기 전이기에 오류
		grandTotal +=10;
	}
	

	public static void main(String[] args) {
		
	add2(); //static변수이기 때문에 이 자체로 함수를 쓸 수 있다.
	
	}
//		StaticExam se = new StaticExam();
//		se.add();
//		StaticExam se2 = new StaticExam();
//		se2.add();
//		
//		System.out.println("total:"+se.total);
//		System.out.println("grandTotal:"+StaticExam.grandTotal);//
//		
//		System.out.println("total2:"+se2.total);
//		System.out.println("grandTotal:"+StaticExam.grandTotal);
//		
//	}
}
