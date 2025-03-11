package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		//ÀÓÀÇÀÇ Á¤¼ö°ª¿¡ ´ëÇØ¼­ ÀüÃ¼ ÀÚ¸®¼ö Áß Â¦¼ö, È¦¼öÀÇ °¹¼ö¸¦ ±¸ÇÏÀÚ.
		//5ÀÚ¸®¼ö ex)12345
		//Â¦¼öÀÇ °¹¼ö:2°³
		//È¦¼öÀÇ °¹¼ö:3°³
		
		Scanner sc=new Scanner(System.in);
		System.out.println("5ÀÚ¸® ÀÔ·Â:");
		
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		
		even+=(num/10000%2==0)?1:0;
		even+=(num/1000%10%2==0)?1:0;
		even+=(num/100%100%2==0)?1:0;
		even+=(num/10%20%2==0)?1:0;
		even+=(num%2==0)?1:0;
		
		odd=5-even;
		
		if (even >odd)
			System.out.println("Â¦¼ö°¡ Å®´Ï´Ù");
		else
			System.out.println("È¦¼ö°¡ Å®´Ï´Ù");
		
		
		
	}

}
