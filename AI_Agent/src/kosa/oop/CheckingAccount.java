package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);//super는 부모(Account)의 생성자를 호출하여 부모에 있는 이 값들을 초기화함.
		//디폴트 생성자를 호출(디폴트 생성자를 항상 만드는 이유 언제 부모가될지 모르기 때문)
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo) || getBalance()< amount) {//balance는 private이기에
		throw new Exception("결재불능");
		}
		
		return withdraw(amount);
		
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("카드번호: "+cardNo);
	}
	
	
}
