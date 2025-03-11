package kosa.oop;

public class MinusAccount extends Account {
	private int creditLine;//���̳ʽ� �ѵ�
	
	public MinusAccount() {}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	

	@Override
	public int withdraw(int amount) throws Exception {
		if(getBalance()+creditLine<amount) {
			throw new Exception("�ܾ׺���");
		}
		
		int balance=getBalance(); //private�� ����Ǿ��־ get set���� �����ؾ���
		setBalance(balance-amount);
		
		return amount;
		
		//return super.withdraw(amount);
		//�� super�� �θ��� �޼��带 ȣ���ϱ� ���� �뵵�� super�Լ��� �ٸ�. �ٵ� ���⼭�� �θ��� withdraw�� �Ⱦ����̴� ����� ��.
		
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("���̳ʽ� �ѵ�:"+creditLine);
	}
	
	//�θ��� withdraw�� ����ϸ� ������ ���� ����.
	//�������̵� ����
	//1. ��Ӱ���
	//2. �޼��� �ñ״�ó(����������, ������, �޼����̸�, �Ķ����) ��ġ
	//3. �޼����� ���븸 ����ġ(�޼����� ���ο� �����ǰ� �ʿ��ϱ� ����)
	
	//�������̵� ��� : Source-Override methods-withdraw(int) ����


}
