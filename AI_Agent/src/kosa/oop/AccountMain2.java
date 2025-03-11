package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		
	
//		Account ca=
//				new CheckingAccount("222-222", "김길동", 5000, "222-222");
//		//부모로 형변환(자식->부모) 묵시적 형변환
//		//데이터 타입만 Account로 형변환한 것임
//		
//		if(ca instanceof CheckingAccount) {
//		CheckingAccount ca2=(CheckingAccount)ca;
//		//부모로 형변환이 되면 자신만이 갖고 있는 메서드를 실행할 수 없음
//		//so 부모->자식: 강제 형변환 필요
//		 try {
//			ca2.pay("222-222", 3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 ca2.printAccount();
//		}
		 
		 //ca2.printAccount();
	
		
		
//		Account arr[]= {
//				new Account("111-111", "홍길동", 10000),
//				new CheckingAccount("222-222", "김길동", 5000, "222-222"),
//				new MinusAccount("333-333", "박길동", 5000, 10000)
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
				new Account("111-111", "홍길동", 10000),
				new CheckingAccount("222-222", "김길동", 5000, "222-222"),
				new MinusAccount("333-333", "박길동", 5000, 10000)
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
//				new MinusAccount("111-111", "박길동", 5000, 10000);
//		
//		try {
//			ma.withdraw(7000);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		ma.printAccount();
		
		
		
//				CheckingAccount ca =
//				new CheckingAccount("111-111", "홍길동", 5000, "222-222");
//		
//		try {
//			ca.pay("222-222", 3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		ca.printAccount();

	}


