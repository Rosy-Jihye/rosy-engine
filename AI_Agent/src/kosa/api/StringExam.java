package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		String str = "ABC";
		String str2 = "ABC";
		//�޸𸮿� �̷� ���� �ִ��� ã�ƺ�. �׷��� str2�� �������� �ʰ� ���� ���� ����.
		String str3= new String("ABC");
		//�̰Ŵ� ������ �޸𸮸� �����ؼ� str, str2�� �ٸ�
		
		if(str==str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}

		//2. String Ŭ������ �Һ����� Ư¡��StringBuffer, StringBuilder(������)
		str.concat("DEF");
		System.out.println(str);
		//concat : ���ڿ� �߰� �޼���
		//���Ͱ��� �ϸ� ���� str�� ABC�� ��µȴ�. String�� �Һ����� ���� �ֱ� ����
		
		String str4 = str.concat("DEF");
		System.out.println(str4);

		StringBuffer sb = new StringBuffer("ABC");
		sb.append("def");
		System.out.println(sb);
		//�޼��带 ���� �ڱ� �ڽ� �ٲ� //���� : �����Ŷ� ���̰� ����?
		
		StringBuilder st = new StringBuilder("ABC");
		st.append("def");
		System.out.println(st);
		
		//�����ڷ� ���氡��
		String sql = "selec*from board ";
		int num =10;
		
		if(num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		//�ش� ���ڿ��� ��ġ �ľ� => indexOf("���ڿ�")=>������ : �ε���, ������ : -1
		//LastIndexOf�� �ڿ��� ã�� ��
		System.out.println(sql.indexOf("from"));
		System.out.println(sql.indexOf(sql.length()));
		
		for(int i=0;i<sql.length();i++) {
			System.out.print(sql.charAt(i));
			//charAt : 1���� ���� ����
		}
		System.out.println();
		
		//���ڿ� �κ����� : subString(5), subString(5, 10)->0���� count�ؼ� 5���� �����ؼ� 10�Ǳ� ��(9)���� ����
		
		//����>sql���� "board" ���ڿ��� ���
		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("board")+5));
		
		//����>
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
	
	
		//���� �ۼ�
		System.out.println(fileName.substring(fileName.indexOf("kosa"),fileName.indexOf("kosa")+4)+":"+fileName.substring(fileName.indexOf("jpg"),fileName.indexOf("jpg")+3));
		
		//������ �ۼ�
		head = fileName.substring(0,fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(head+":"+pattern);
		;
		
		//endsWith�� �������� �������� �������� üũ
		if(fileName.endsWith("jpg")) {
			System.out.println("�̹��� ����");
		}
		
		//startsWith�� �������� �������� �������� üũ
		if(fileName.startsWith("kosa")) {
			System.out.println("kosa ����");
		}
		
		String id ="kosa";
		String m_id = "Kosa ";
		m_id = m_id.toLowerCase(); //�̷��� Kosa�� �ҹ��ڷ� �����ϴ� ����� �ִ�
		
		if(id.equals(m_id.trim())) { //equals�� ��ҹ��ڸ� ����, ���� ���� //equalsIgnoreCase�� ��ҹ��� ����x //trim�� ���� ���� ������
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		
		//���ڿ� => String[] ��ȯ
		//"���, ����, ����, ��"
		String fruits = "���, ����, ����, ��";
		String arr[] = fruits.split(", "); //���� ������ �������� �߶� �迭�� �־���.
		System.out.println(Arrays.deepToString(arr));
		
		//���ڿ� => char[]
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//���ڿ� => byte[] ��ȯ
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes(); //�ƽ�Ű �ڵ尪���� ���
		System.out.println(Arrays.toString(arr3));
				
		//���ڿ� => ������
		String str7 = "100";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);
		
		//������ => ���ڿ�
		int num3 = 10;
		String str8 = String.valueOf(num3);
		String str9 = 10+str8; //����
		System.out.println(str9);
		
		
	}

}
