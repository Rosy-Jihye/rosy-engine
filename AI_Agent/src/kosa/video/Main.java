package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "Æ®·£½ºÆ÷¸Ó", "¼­ºÀ¼ö");
		Video v2 = new Video("2", "ÄôÇªÆÒ´õ2", "Áö¼º¹Î");
		
		GeneralMember gm = new GeneralMember("aaa","È«±æµ¿","µ¿Åº");
		gm.rental(v2);
		gm.printMember();
		
		SpecialMember sm=
				new SpecialMember("1", "¹Ú±æµ¿", "°¡¶ôµ¿", 100);
		
		sm.rental(v1);
		sm.printSpecialMember();
	
		
	}

}
