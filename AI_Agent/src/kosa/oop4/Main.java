package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		//MyType =>익명클래스 구현해보자
		
//		MyType my1 = new MyType() { //이런 형태는 추상클래스나 인터페이스다.
//			
//			public void hello() {
//				System.out.println("익명 클래스 형식 입니다.");
//				
//			}
//		};
//		my1.hello();
		
		//람다식(함수형 프로그램)으로 구현
		//인터페이스 안에 추상 메서드가 하나일때 가능
		MyType my2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		
		my2.hello();
		
		MyType my3 = ()->System.out.println("람다식 2째 형식");
		my3.hello();
		
		
		YourType you = (String message)->{
			System.out.println("메세지 : "+ message);
		};
		you.talk("Hello");
		
		YourType you2 =  message-> System.out.println("메세지 : "+ message);
		you.talk("안녕하세요!");
		
		
		MyNumber my = (x, y) -> (x>y)?x:y;
		System.out.println(my.getMax(10,20));
		
		
		//Runnable => 람다식 표현
		Runnable r = ()->{
			//System.out.println("메인 동작");
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
