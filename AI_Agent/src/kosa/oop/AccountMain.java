package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account; //Account�� �ּҰ��� �ֱ� ���� �������� �� Ŭ���� Ÿ�� *Ŭ���� �̸��� ������ Ÿ���� �� �� ���� // �̶��� account�� �ƹ��͵� ����.
		account = new Account("111-111", "ȫ�浿", 10000);//��ü ����(���ο� �޸� �Ҵ�) = �ν��Ͻ�ȭ
		//������ ��ü�� account��� ������ ���ؼ� ���� �����ϰ� ��.
		//account�� �ν��Ͻ� ����, ��������, ��ü��� �ϱ⵵ ��.
		//account�� �ʵ�, �޼��尡 �� �ּҸ� ������Ŵ. �̿� �ش� �ʵ�� �޼��带 �ʿ��� �� ����� �� ����.

		Account account2 = new Account("222-222", "�ڱ浿", 20000);
		//�̷��� ���� �͵� ����. Account()��� �޼��带 account2��� ��ü�� �Ҵ��Ұǵ� �� ��ü�� �տ� Account Ŭ������ ������ ���󰣴ٴ� �ǹ�
		//�տ����� Ŭ���� Account�� �ؾ Ʋ �Ѱ�, �� �ȿ� ������ ����. �׸��� �ڿ� Account() �޼��嵵 Ŭ���� Account�� ���ԵǾ�������, �̴� �ؾ�� ����� ����. �׸��� account2 ��ü�� �ؾ.
		
		Account account3 = new Account("333-333","��浿");
		//��ü �������� ������ �ȳ����� �����ڿ��� ����������
		
		
//		account.accountNo="111-111";
//		account.ownerName="ȫ�浿";
//		account.balance=10000;
//		
//		
//		account2.accountNo="222-222";
//		account2.ownerName="�ڱ浿";
//		account2.balance=10000;
//		���� ���� ��ü�� ���������� �ʱ�ȭ�߾��µ� �����ڸ� ���� ��������.
		
		account.deposit(5000);
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			e.printStackTrace();//�ܼ�â�� �ͼ��� �޼����� ����ϴ� ��ɾ�
		}//���ܰ� �߻��ϸ� �׶� catch ����
		
		account.printAccount();
		System.out.println("===================");
		account2.printAccount();
		System.out.println("===================");
		account3.printAccount();

//		���� ���� ������� �ݺ��Ǵ� ���� �ѹ��� �ϱ�
//		System.out.println("���¹�ȣ: "+account.accountNo);
//		System.out.println("������: "+account.ownerName);
//		System.out.println("�ܾ�: "+account.balance);
//		System.out.println("======================");
//		
//		System.out.println("���¹�ȣ: "+account2.accountNo);
//		System.out.println("������: "+account2.ownerName);
//		System.out.println("�ܾ�: "+account2.balance);
		
		

	}

}
