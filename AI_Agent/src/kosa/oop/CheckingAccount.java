package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);//super�� �θ�(Account)�� �����ڸ� ȣ���Ͽ� �θ� �ִ� �� ������ �ʱ�ȭ��.
		//����Ʈ �����ڸ� ȣ��(����Ʈ �����ڸ� �׻� ����� ���� ���� �θ𰡵��� �𸣱� ����)
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo) || getBalance()< amount) {//balance�� private�̱⿡
		throw new Exception("����Ҵ�");
		}
		
		return withdraw(amount);
		
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("ī���ȣ: "+cardNo);
	}
	
	
}
