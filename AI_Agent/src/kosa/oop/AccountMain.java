package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account; //Account는 주소값을 넣기 위한 참조형들 중 클래스 타입 *클래스 이름도 데이터 타입이 될 수 있음 // 이때는 account에 아무것도 없음.
		account = new Account("111-111", "홍길동", 10000);//객체 생성(새로운 메모리 할당) = 인스턴스화
		//생성된 객체를 account라는 변수를 통해서 참조 가능하게 됨.
		//account는 인스턴스 변수, 참조변수, 객체라고 하기도 함.
		//account에 필드, 메서드가 들어간 주소를 참조시킴. 이에 해당 필드와 메서드를 필요할 때 사용할 수 있음.

		Account account2 = new Account("222-222", "박길동", 20000);
		//이렇게 쓰는 것도 가능. Account()라는 메서드를 account2라는 객체에 할당할건데 이 객체는 앞에 Account 클래스의 동작을 따라간다는 의미
		//앞에쓰인 클래스 Account는 붕어빵 틀 한개, 그 안에 재료들이 있음. 그리고 뒤에 Account() 메서드도 클래스 Account에 포함되어있으며, 이는 붕어빵을 만드는 행위. 그리고 account2 객체가 붕어빵.
		
		Account account3 = new Account("333-333","김길동");
		//객체 생성에서 오류가 안나려면 생성자에서 만들어줘야함
		
		
//		account.accountNo="111-111";
//		account.ownerName="홍길동";
//		account.balance=10000;
//		
//		
//		account2.accountNo="222-222";
//		account2.ownerName="박길동";
//		account2.balance=10000;
//		위와 같이 객체를 개별적으로 초기화했었는데 생성자를 만들어서 간편해짐.
		
		account.deposit(5000);
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			e.printStackTrace();//콘솔창에 익셉션 메세지를 출력하는 명령어
		}//예외가 발생하면 그때 catch 실행
		
		account.printAccount();
		System.out.println("===================");
		account2.printAccount();
		System.out.println("===================");
		account3.printAccount();

//		위와 같은 방법으로 반복되는 행위 한번에 하기
//		System.out.println("계좌번호: "+account.accountNo);
//		System.out.println("계좌주: "+account.ownerName);
//		System.out.println("잔액: "+account.balance);
//		System.out.println("======================");
//		
//		System.out.println("계좌번호: "+account2.accountNo);
//		System.out.println("계좌주: "+account2.ownerName);
//		System.out.println("잔액: "+account2.balance);
		
		

	}

}
