package kosa.bank;

public class Account {
	
	private String id;
	private long balance;
	
	public Account() {}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount) {//amount는 파리미터이고 deposit과 withdraw 행위에서만 쓰이기 때문에 위에서 선언하지 않아도 됨
		balance += amount;
	}
	
	public boolean withdraw(long amount) {
		//추후 if에 쓰이기에 boolean으로 함
		if(balance<amount)
			return false;
		
		balance -= amount;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	

}
