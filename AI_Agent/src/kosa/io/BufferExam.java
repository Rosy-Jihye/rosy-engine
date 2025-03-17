package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner => Ű���� ������ �Է�
		// System.in => InputStream (byte���� �о���̱� ����) => InputStreamReader (byte ���� �ڵ����� ���ڷ� ��ȯ) => BufferedReader (�ѱ��ھ� �ƴ϶� ���⾿ �б� ���� ��)
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("�Է�");
			String str = "";
			while((str = br.readLine()) != null) {
				str += "\n";
				bw.write(str);
			}
			System.out.println("����Ϸ�"); //ctrl+z�ϸ� ����Ϸ�� �Ѿ
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			}catch (Exception e) {}
		}

	}

}
