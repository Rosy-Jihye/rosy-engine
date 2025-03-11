package kosa.bank;

public class Customer {

	private String id;
	private String name;
	private Account account;
	//account 아직 생성되지 않은 상태 (new가 없을 때)
	
	public Customer() {	}

	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.account = new Account(id, balance);
		//그 고객의 account 이제 생성하여 왼쪽 account에 삽입
	}
	//Customer 생성될 때 Account도 생성되어야함.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
