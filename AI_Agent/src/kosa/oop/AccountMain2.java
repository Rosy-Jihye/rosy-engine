package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		
	
//		Account ca=
//				new CheckingAccount("222-222", "��浿", 5000, "222-222");
//		//�θ�� ����ȯ(�ڽ�->�θ�) ������ ����ȯ
//		//������ Ÿ�Ը� Account�� ����ȯ�� ����
//		
//		if(ca instanceof CheckingAccount) {
//		CheckingAccount ca2=(CheckingAccount)ca;
//		//�θ�� ����ȯ�� �Ǹ� �ڽŸ��� ���� �ִ� �޼��带 ������ �� ����
//		//so �θ�->�ڽ�: ���� ����ȯ �ʿ�
//		 try {
//			ca2.pay("222-222", 3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 ca2.printAccount();
//		}
		 
		 //ca2.printAccount();
	
		
		
//		Account arr[]= {
//				new Account("111-111", "ȫ�浿", 10000),
//				new CheckingAccount("222-222", "��浿", 5000, "222-222"),
//				new MinusAccount("333-333", "�ڱ浿", 5000, 10000)
//		};
//
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] instanceof CheckingAccount) {
//				CheckingAccount ca2=(CheckingAccount)arr[i];
//				 try {
//						ca2.pay("222-222", 3000);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//					 
//			}
//			arr[i].printAccount();
//		}
//			
//		}
//		
		
		
		Account arr[]= {
				new Account("111-111", "ȫ�浿", 10000),
				new CheckingAccount("222-222", "��浿", 5000, "222-222"),
				new MinusAccount("333-333", "�ڱ浿", 5000, 10000)
		};

		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("222-222", 3000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
				arr[i].printAccount();
			}
		}
			
//		MinusAccount ma =
//				new MinusAccount("111-111", "�ڱ浿", 5000, 10000);
//		
//		try {
//			ma.withdraw(7000);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		ma.printAccount();
		
		
		
//				CheckingAccount ca =
//				new CheckingAccount("111-111", "ȫ�浿", 5000, "222-222");
//		
//		try {
//			ca.pay("222-222", 3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		ca.printAccount();

	}


