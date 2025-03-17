package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner => 키보드 데이터 입력
		// System.in => InputStream (byte값을 읽어들이기 위함) => InputStreamReader (byte 값을 자동으로 문자로 변환) => BufferedReader (한글자씩 아니라 한출씩 읽기 위해 씀)
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("입력");
			String str = "";
			while((str = br.readLine()) != null) {
				str += "\n";
				bw.write(str);
			}
			System.out.println("쓰기완료"); //ctrl+z하면 쓰기완료로 넘어감
			
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
