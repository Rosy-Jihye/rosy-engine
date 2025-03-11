package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
		String data[]= {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
				
		};
		
//		Pattern p = Pattern.compile("c[a-z]*"); //정규표현식을 객체화한 p //c[a-z]* : c만 있거나, c뒤에 온다면 문자열이 와야함
//		
//		for(int i=0;i<data.length;i++) {
//			Matcher m =p.matcher(data[i]);
//			if(m.matches()) { //Matcher 안에 matches라는 메서드를 통해서 맞는지 안맞는지 체크 가능
//				System.out.println(data[i]);
//			}
		
		//마지막에 소문자 a만 출력
//		Pattern a = Pattern.compile("\\w+a");
//		
//		for(int i=0;i<data.length;i++) {
//		Matcher m =a.matcher(data[i]);
//		if(m.matches()) { //Matcher 안에 matches라는 메서드를 통해서 맞는지 안맞는지 체크 가능
//			System.out.println(data[i]);
//		}
//			
//		}
		
//		String source = "ab?cd?ef?gh"; //?는 분리를 위한 것임
//		String reg = "(\\w*)";
//		
//		Pattern p = Pattern.compile(reg); //p라는 패턴으로 만들었어
//		Matcher m = p.matcher(source);
//		
//		while(m.find()) { //find가 boolean이니까 있을 때까지 while을 돌아라
//			System.out.println(m.group()); //그룹별 뽑아줌
//		}
		
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
		String reg = "(\\d*\\-\\d*\\-\\d*)"; //그룹은 ()이렇게 괄호 필요
		//"(\\d{2,3}-\\d{3,4}-\\d{4})"
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			System.out.println(m.group());
		}
			
		
		
				
				

	}

}
