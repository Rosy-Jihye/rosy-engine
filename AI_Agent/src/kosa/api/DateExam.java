package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExam {

	public static void main(String[] args) {
		
		//Calendar 객체 통해 날짜 가져오기
		Calendar gc = Calendar.getInstance(); //이렇게만 해도 현재 날짜 만들어짐
		gc.add(Calendar.DATE, 100); //100일 더하는 방법
		//System.out.println(gc);

		//SimpleDataFormat 형태로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str = sdf.format(gc.getTime());
		System.out.println(str);

		//Date 객체를 통해 SimpleDataFormat 형태로 출력
		Date now = new Date(); //이렇게만 해도 현재 날짜 만들어짐
		String str2 = now.toString();
		System.out.println(str2);
		
		//키보드 => 날짜입력 2025/03/10 (문자열) => Date 객체 변환
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Scanner sc = new Scanner(System.in);
		Date date = null;
		try {
			System.out.print("날짜입력: ");
			String str3 = sc.nextLine();
			date = df.parse(str3);
			//문자열을 Date 객체로 변환. str3를 파싱해서 date에 넣는다
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String str4 = sdf.format(date); //Date를 SimpleDateFormat 형태의 문자열로 변환
		System.out.println(str4);
				
	}

}
