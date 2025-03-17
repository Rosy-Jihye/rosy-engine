package kosa.io;

import java.io.FileWriter;
import java.util.Scanner;

public class KosaWriter {

	public static void main(String[] args) {
		//키보드로부터 문자열을 입력 받아 파일에 쓰는 예제를 구현
		//"q"를 입력하기 전까지 문자열을 
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String str = "";
		String poem = "";
		
		System.out.print("입력: ");
		while(!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);
			//poem이  writer에 연결되어있어서 poem2.txt를 씀
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				//writer.close()를 해야 쓰기가 됨
			}catch (Exception e2) {}
		}

	}	//이클립스는 새로 생성되는 파일을 반영하려면  refresh를 통해 해야함
	
}

