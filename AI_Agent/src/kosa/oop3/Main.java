package kosa.oop3;

public class Main {
	public static void main(String[] args) {
			Drive drive = new Drive();
			Study study = new Study();
			//열심히 일하는 Role 추가=>익명 내부 클래스 이용

			
//			Person p = new Person("홍길동", new Role() {
//				
//				@Override
//				public void doing() {
//					System.out.println("열심히 일하기");
//					
//				}
//			});
//			p.doIt();
			
			Role r = new Role() {
				@Override
				public void doing() {
					System.out.println("열심히 일하기");	
			}
			};
			Person p = new Person("홍길동", r);
			p.doIt();
}
}
