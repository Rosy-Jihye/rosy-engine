package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExam {

	public static void main(String[] args) {
		
		//Calendar ��ü ���� ��¥ ��������
		Calendar gc = Calendar.getInstance(); //�̷��Ը� �ص� ���� ��¥ �������
		gc.add(Calendar.DATE, 100); //100�� ���ϴ� ���
		//System.out.println(gc);

		//SimpleDataFormat ���·� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str = sdf.format(gc.getTime());
		System.out.println(str);

		//Date ��ü�� ���� SimpleDataFormat ���·� ���
		Date now = new Date(); //�̷��Ը� �ص� ���� ��¥ �������
		String str2 = now.toString();
		System.out.println(str2);
		
		//Ű���� => ��¥�Է� 2025/03/10 (���ڿ�) => Date ��ü ��ȯ
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Scanner sc = new Scanner(System.in);
		Date date = null;
		try {
			System.out.print("��¥�Է�: ");
			String str3 = sc.nextLine();
			date = df.parse(str3);
			//���ڿ��� Date ��ü�� ��ȯ. str3�� �Ľ��ؼ� date�� �ִ´�
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String str4 = sdf.format(date); //Date�� SimpleDateFormat ������ ���ڿ��� ��ȯ
		System.out.println(str4);
				
	}

}
