package kosa.video;

public class SpecialMember extends GeneralMember{

	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String addr, int bonusPoint) {
		super(id, name, addr);
		this.bonusPoint = bonusPoint;
	}

	public void printSpecialMember() {
		System.out.println("회원 아이디: "+ getId());
		System.out.println("회원 이름: "+ getName());
		System.out.println("회원 주소: "+ getAddress());
		System.out.println("회원 보너스: "+ bonusPoint);
		getRentalVideo().show();
		
	}

}
