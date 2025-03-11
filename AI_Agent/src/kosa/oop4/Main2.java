package kosa.oop4;

interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("B 메서드 호출");
	}
}

interface AA{
	BB abc(String name);
	//데이터 타입+메서드명
}

class BB{
	BB(String name){
		System.out.println("BB 생성자:"+name);
	}
	//클래스명만 있기에 이것은 생성자 형성
}


public class Main2 {
	public static void main(String[] args) {
		//1. 익명내부 클래스
		AA a1 = new AA() {
			
			@Override
			public BB abc(String name) {
				return new BB(name);
			}
		};
		a1.abc("홍길동"); //abc 메서드에 홍길동 입력하면 BB에 들어가서 출력
		
		//2. 람다식으로 표현
		AA a2= (name)-> new BB(name);
		a2.abc("박길동");
		
		//3. 인스턴스 참조
		AA a3 = BB::new;
		a3.abc("김길동");
		//BB 생성자에 name을 새로 넣어서 출력
		
		
		
		
		
		
		
//		//1. 익명클래스를 이용해서 abc() 오버라이딩 -> B를 생성해서 bcd() 호출해보세요.
//		A a = new A() {
//			
//			@Override
//			public void abc() {
//				B b = new B();
//				b.bcd();
//				
//			}
//		};//익명클래스의 범위
//		
//		a.abc();//abc가 오버라이딩 되어있기에 bcd가 호출된다
//
//
//		//2. 해당 내용을 람다식으로 구현
//		A a2 =()->{
//			B b =new B();
//			b.bcd();
//		};
//		
//		a2.abc();
//	
//		//3. 인스턴스 참조
//		B b =new B();
//		A a3 = B::bcd; //b가 bcd를 참조하겠다
//		
//		a3.abc();
	
	

	}

}
