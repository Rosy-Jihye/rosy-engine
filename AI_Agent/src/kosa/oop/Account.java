package kosa.oop;

public class Account {
	//Account 클래스로부터 Account 객체를 생성
	//객체로부터 공통된 데이터 구조와 기능을 추출
	//상태(필드): 계좌번호, 계좌주, 잔액
	//기능(메서드):입금하다. 출금하다.
	
	//접근제어자
	//private(해당 클래스 안에서만)
	//default(해당 패키지 안에서만)
	//protected(default+부모클래스)
	//public(모두)
	
	//필드=>private=>set(초기화)/get(뽑아내기)메서드를 활용하여 우회하여 접근=>정보은닉(캡슐화)
	private String accountNo;
	private String ownerName;
	private int balance;
	//이거는 객체가 생성될 때 활성화되고 객체가 존재할 때 계속 존재
	
	

	public Account( ) {	}
	//디폴트 생성자(파라미터가 없는 것)
	//Account account4 = new Account(); 이렇게 필드값이 없는 것도 오류가 안나게 하려면 있어야함.
	
	//생성자(constructor)
	//객체를 초기화하는 용도로 씀
	//객체를 생성할 수있는 타입을 결정
	//public 리턴형 안함
	//클래스명과 동일하게 함
		
	public Account(String accountNo, String ownerName, int balance) {
	//매개변수는 지역변수 특징과 같기에 이 메모리에 있다가 사라짐
	//파라미터값을 잠깐 받는 것임
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		//this.balance가 위에 int balance임. 자기 객체를 의미함
		//변수명이 다르면 이렇게 this 안붙여도 됨.
		
	}
	
	public Account(String accountNo, String ownerName){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		
	}
	
	
	//입금하다.//return값을 안하고 싶으면 void
	public void deposit(int amount) {
		balance += amount;		
	}
	
	//출금하다.//return값을 하고 싶으면 int
	public int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액부족");			
		}
		balance -= amount;
		
		return amount;
	}
	public void printAccount() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("계좌주: "+ownerName);
		System.out.println("잔액: "+balance);
		
		//질문 : 메소드 이름이나 생성자 이름은 같을 수 있는데 데이터타입으로 구분하면 된다??
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	}
