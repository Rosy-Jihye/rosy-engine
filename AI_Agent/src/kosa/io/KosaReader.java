package kosa.io;

import java.io.FileReader;

public class KosaReader {

	public static void main(String[] args) {
		//poem.txt에서 문자열 데이터를 읽어오기
		FileReader reader = null;
		//밖에 선언되어있어야 reader를 close할 수 있음. java입출력은 io를 빌생시키기에 예외를 고려하는 것이 중요
		char arr[] = new char[256];
		
		try {
			//FileReader 객체 생성
			reader = new FileReader("poem.txt");
			while(true) {
				int data = reader.read(arr); //아스키 코드값을 리턴하거나 -1을 리턴 (-1은 더이상 읽을 것이 없다는 의미)
				if(data == -1) break;
				System.out.print(arr);
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally { //finally는 예외가 발생하든 발생하지 않든 호출되기에 마무리 작업에 넣으면 좋음
			try{
				reader.close(); //이 메서드도 예외처리를 무조건 해야하는 메서드이기에 try catch를 함
			}catch (Exception e2) {}
		}

	}

}
