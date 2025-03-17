package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyExam {

	public static void main(String[] args) {
		// poem2.txt => poem3.txt : 복사를 구현해보자.
		
		//FileReader reader =  new FileReader("poem2.txt");
		
		FileReader reader =  null;
		FileWriter writer = null;
		String poem = "";
		
		try {
			reader = new FileReader("poem2.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
				poem += (char)data;
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				reader.close();
			}catch (Exception e2) {}
		}
		
		try {
			writer = new FileWriter("poem3.txt");
			writer.write(poem);
			
		}catch (Exception e3) {
			e3.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch (Exception e4) {}
		}
		
	}

}
