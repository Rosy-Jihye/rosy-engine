package kosa.io;

import java.io.FileWriter;
import java.util.Scanner;

public class KosaWriter {

	public static void main(String[] args) {
		//Ű����κ��� ���ڿ��� �Է� �޾� ���Ͽ� ���� ������ ����
		//"q"�� �Է��ϱ� ������ ���ڿ��� 
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String str = "";
		String poem = "";
		
		System.out.print("�Է�: ");
		while(!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);
			//poem��  writer�� ����Ǿ��־ poem2.txt�� ��
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				//writer.close()�� �ؾ� ���Ⱑ ��
			}catch (Exception e2) {}
		}

	}	//��Ŭ������ ���� �����Ǵ� ������ �ݿ��Ϸ���  refresh�� ���� �ؾ���
	
}

