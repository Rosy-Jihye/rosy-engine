package kosa.oop;

public class MinusAccount extends Account {
	private int creditLine;//마이너스 한도
	
	public MinusAccount() {}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	

	@Override
	public int withdraw(int amount) throws Exception {
		if(getBalance()+creditLine<amount) {
			throw new Exception("잔액부족");
		}
		
		int balance=getBalance(); //private로 선언되어있어서 get set으로 진행해야함
		setBalance(balance-amount);
		
		return amount;
		
		//return super.withdraw(amount);
		//이 super는 부모의 메서드를 호출하기 위한 용도로 super함수와 다름. 근데 여기서는 부모의 withdraw를 안쓸것이니 지우면 됨.
		
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("마이너스 한도:"+creditLine);
	}
	
	//부모의 withdraw를 사용하면 목적과 맞지 않음.
	//오버라이딩 조건
	//1. 상속관계
	//2. 메서드 시그니처(접근제어자, 리턴형, 메서드이름, 파라미터) 일치
	//3. 메서드의 내용만 불일치(메서드의 새로운 재정의가 필요하기 때문)
	
	//오버라이딩 방법 : Source-Override methods-withdraw(int) 선택


}
