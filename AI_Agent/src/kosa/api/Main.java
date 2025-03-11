package kosa.api;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		if(p1.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//Object equals는 주소값으로 비교
		//new할 때마다 새로운 주소값 갖고 있음
	

	}

}
