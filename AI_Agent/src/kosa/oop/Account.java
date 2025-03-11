package kosa.oop;

public class Account {
	//Account Ŭ�����κ��� Account ��ü�� ����
	//��ü�κ��� ����� ������ ������ ����� ����
	//����(�ʵ�): ���¹�ȣ, ������, �ܾ�
	//���(�޼���):�Ա��ϴ�. ����ϴ�.
	
	//����������
	//private(�ش� Ŭ���� �ȿ�����)
	//default(�ش� ��Ű�� �ȿ�����)
	//protected(default+�θ�Ŭ����)
	//public(���)
	
	//�ʵ�=>private=>set(�ʱ�ȭ)/get(�̾Ƴ���)�޼��带 Ȱ���Ͽ� ��ȸ�Ͽ� ����=>��������(ĸ��ȭ)
	private String accountNo;
	private String ownerName;
	private int balance;
	//�̰Ŵ� ��ü�� ������ �� Ȱ��ȭ�ǰ� ��ü�� ������ �� ��� ����
	
	

	public Account( ) {	}
	//����Ʈ ������(�Ķ���Ͱ� ���� ��)
	//Account account4 = new Account(); �̷��� �ʵ尪�� ���� �͵� ������ �ȳ��� �Ϸ��� �־����.
	
	//������(constructor)
	//��ü�� �ʱ�ȭ�ϴ� �뵵�� ��
	//��ü�� ������ ���ִ� Ÿ���� ����
	//public ������ ����
	//Ŭ������� �����ϰ� ��
		
	public Account(String accountNo, String ownerName, int balance) {
	//�Ű������� �������� Ư¡�� ���⿡ �� �޸𸮿� �ִٰ� �����
	//�Ķ���Ͱ��� ��� �޴� ����
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		//this.balance�� ���� int balance��. �ڱ� ��ü�� �ǹ���
		//�������� �ٸ��� �̷��� this �Ⱥٿ��� ��.
		
	}
	
	public Account(String accountNo, String ownerName){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		
	}
	
	
	//�Ա��ϴ�.//return���� ���ϰ� ������ void
	public void deposit(int amount) {
		balance += amount;		
	}
	
	//����ϴ�.//return���� �ϰ� ������ int
	public int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("�ܾ׺���");			
		}
		balance -= amount;
		
		return amount;
	}
	public void printAccount() {
		System.out.println("���¹�ȣ: "+accountNo);
		System.out.println("������: "+ownerName);
		System.out.println("�ܾ�: "+balance);
		
		//���� : �޼ҵ� �̸��̳� ������ �̸��� ���� �� �ִµ� ������Ÿ������ �����ϸ� �ȴ�??
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
