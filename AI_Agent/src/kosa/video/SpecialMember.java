package kosa.video;

public class SpecialMember extends GeneralMember{

	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String addr, int bonusPoint) {
		super(id, name, addr);
		this.bonusPoint = bonusPoint;
	}

	public void printSpecialMember() {
		System.out.println("ȸ�� ���̵�: "+ getId());
		System.out.println("ȸ�� �̸�: "+ getName());
		System.out.println("ȸ�� �ּ�: "+ getAddress());
		System.out.println("ȸ�� ���ʽ�: "+ bonusPoint);
		getRentalVideo().show();
		
	}

}
