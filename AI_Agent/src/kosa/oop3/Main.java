package kosa.oop3;

public class Main {
	public static void main(String[] args) {
			Drive drive = new Drive();
			Study study = new Study();
			//������ ���ϴ� Role �߰�=>�͸� ���� Ŭ���� �̿�

			
//			Person p = new Person("ȫ�浿", new Role() {
//				
//				@Override
//				public void doing() {
//					System.out.println("������ ���ϱ�");
//					
//				}
//			});
//			p.doIt();
			
			Role r = new Role() {
				@Override
				public void doing() {
					System.out.println("������ ���ϱ�");	
			}
			};
			Person p = new Person("ȫ�浿", r);
			p.doIt();
}
}
