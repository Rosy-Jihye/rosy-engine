package kosa.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 문자열 내용으로 비교하겠다=>문자열.equals("문자열")
		
		//String a="aaa";
		//String b="bbb";
		
		//if(a.equals(b)) {
		//	System.out.println("같다");
		//}else {
		//	System.out.println("틀리다");
		//}

		
		//두 정수와 연산자 문자열을 입력 받습니다.
		//사칙연산 계산기 만들어 보자.
		//ex>정수1: 50
		//	   정수2: 20
		//	   연산자:+
		//결과>70
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수 1:");
		double num1=Integer.parseInt(sc.nextLine());
		System.out.print("정수 2:");
		double num2=Integer.parseInt(sc.nextLine());
		System.out.print("연산자:");
		String oper=sc.nextLine();
		
		double result=0;
		
		if(oper.equals("+")) {
			result=num1+num2;
		}else if(oper.equals("-")) {
			result=num1-num2;
		}else if(oper.equals("*")) {
			result=num1*num2;
		}else {
			result=num1/num2;
		}
		
		System.out.println("결과:"+result);
		
		

				
		//switch(oper) {
		//case"+":
		//	result=num1+num2;
		//	break;
		//case"-":
		//	result=num1-num2;
		//	break;
		//case"*":
	//		result=num1*num2;
	//		break;
	//	case"/":
	//		result=num1/(double)num2;
	//		break;
//		}
//		System.out.println("결과:"+result);
	}

}
