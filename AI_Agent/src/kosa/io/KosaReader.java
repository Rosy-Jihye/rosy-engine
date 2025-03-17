package kosa.io;

import java.io.FileReader;

public class KosaReader {

	public static void main(String[] args) {
		//poem.txt���� ���ڿ� �����͸� �о����
		FileReader reader = null;
		//�ۿ� ����Ǿ��־�� reader�� close�� �� ����. java������� io�� ������Ű�⿡ ���ܸ� ����ϴ� ���� �߿�
		char arr[] = new char[256];
		
		try {
			//FileReader ��ü ����
			reader = new FileReader("poem.txt");
			while(true) {
				int data = reader.read(arr); //�ƽ�Ű �ڵ尪�� �����ϰų� -1�� ���� (-1�� ���̻� ���� ���� ���ٴ� �ǹ�)
				if(data == -1) break;
				System.out.print(arr);
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally { //finally�� ���ܰ� �߻��ϵ� �߻����� �ʵ� ȣ��Ǳ⿡ ������ �۾��� ������ ����
			try{
				reader.close(); //�� �޼��嵵 ����ó���� ������ �ؾ��ϴ� �޼����̱⿡ try catch�� ��
			}catch (Exception e2) {}
		}

	}

}
