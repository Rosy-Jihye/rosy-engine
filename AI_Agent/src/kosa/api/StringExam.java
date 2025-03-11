package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		String str = "ABC";
		String str2 = "ABC";
		//메모리에 이런 놈이 있는지 찾아봐. 그래서 str2은 생성하지 않고 기존 것을 참조.
		String str3= new String("ABC");
		//이거는 무조건 메모리를 생성해서 str, str2와 다름
		
		if(str==str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

		//2. String 클래스는 불변성의 특징⇒StringBuffer, StringBuilder(가변성)
		str.concat("DEF");
		System.out.println(str);
		//concat : 문자열 추가 메서드
		//위와같이 하면 기존 str인 ABC가 출력된다. String은 불변성을 갖고 있기 때문
		
		String str4 = str.concat("DEF");
		System.out.println(str4);

		StringBuffer sb = new StringBuffer("ABC");
		sb.append("def");
		System.out.println(sb);
		//메서드를 통해 자기 자신 바꿈 //질문 : 위에거랑 차이가 뭐지?
		
		StringBuilder st = new StringBuilder("ABC");
		st.append("def");
		System.out.println(st);
		
		//연산자로 변경가능
		String sql = "selec*from board ";
		int num =10;
		
		if(num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		//해당 문자열의 위치 파악 => indexOf("문자열")=>있으면 : 인덱스, 없으면 : -1
		//LastIndexOf는 뒤에서 찾는 것
		System.out.println(sql.indexOf("from"));
		System.out.println(sql.indexOf(sql.length()));
		
		for(int i=0;i<sql.length();i++) {
			System.out.print(sql.charAt(i));
			//charAt : 1개의 문자 리턴
		}
		System.out.println();
		
		//문자열 부분추출 : subString(5), subString(5, 10)->0부터 count해서 5부터 시작해서 10되기 전(9)까지 추출
		
		//퀴즈>sql변수 "board" 문자열만 출력
		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("board")+5));
		
		//퀴즈>
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
	
	
		//내가 작성
		System.out.println(fileName.substring(fileName.indexOf("kosa"),fileName.indexOf("kosa")+4)+":"+fileName.substring(fileName.indexOf("jpg"),fileName.indexOf("jpg")+3));
		
		//교수님 작성
		head = fileName.substring(0,fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(head+":"+pattern);
		;
		
		//endsWith는 마지막에 무엇으로 끝나는지 체크
		if(fileName.endsWith("jpg")) {
			System.out.println("이미지 파일");
		}
		
		//startsWith는 마지막에 무엇으로 끝나는지 체크
		if(fileName.startsWith("kosa")) {
			System.out.println("kosa 파일");
		}
		
		String id ="kosa";
		String m_id = "Kosa ";
		m_id = m_id.toLowerCase(); //이렇게 Kosa를 소문자로 변경하는 방법도 있다
		
		if(id.equals(m_id.trim())) { //equals는 대소문자를 구분, 공백 구분 //equalsIgnoreCase는 대소문자 구분x //trim을 쓰면 공백 없애줌
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		//문자열 => String[] 변환
		//"사과, 포도, 수박, 배"
		String fruits = "사과, 포도, 수박, 배";
		String arr[] = fruits.split(", "); //반점 공백을 기준으로 잘라서 배열어 넣어줘.
		System.out.println(Arrays.deepToString(arr));
		
		//문자열 => char[]
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//문자열 => byte[] 변환
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes(); //아스키 코드값으로 출력
		System.out.println(Arrays.toString(arr3));
				
		//문자열 => 정수형
		String str7 = "100";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);
		
		//정수형 => 문자열
		int num3 = 10;
		String str8 = String.valueOf(num3);
		String str9 = 10+str8; //질문
		System.out.println(str9);
		
		
	}

}
