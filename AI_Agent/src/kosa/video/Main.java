package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "Ʈ��������", "������");
		Video v2 = new Video("2", "��Ǫ�Ҵ�2", "������");
		
		GeneralMember gm = new GeneralMember("aaa","ȫ�浿","��ź");
		gm.rental(v2);
		gm.printMember();
		
		SpecialMember sm=
				new SpecialMember("1", "�ڱ浿", "������", 100);
		
		sm.rental(v1);
		sm.printSpecialMember();
	
		
	}

}
