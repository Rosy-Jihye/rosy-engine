package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		//키보드로부터 수학 수식을 입력
		//((2+3)+10)=>괄호 일치/불일치 판단
		//먼저들어간 놈이 나중에 나온다
		
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		
		System.out.println("수식입력: ");
		String str = sc.nextLine();
		
		try {
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				
				if(ch =='(') { //ch은 작은 따옴표, str이 큰 따옴표 //여는 괄호가 있으면 stack에 여는 괄호를 넣는다.
					stack.push(ch+""); //ch를 str으로 변환
				}else if(ch==')') { 
					stack.pop(); //닫는 괄호가 있으면 stack에 들어가있는 여는 괄호 중 제일 마지막에 들어간 것부터 뺀다 //뺄 것이 부족하면 예외 발생시킴
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 불일치합니다.");
			}
			
			
		}catch (Exception e) {
			System.out.println("괄호가 불일치합니다.");
		}

//		for(int i=0;i<math.length();i++) {
//			if(math.charAt(i)=="(") {
//				stack.push(math.charAt(i))+"";	
//			} else if (math.charAt(i)==")") {
//				if (stack.isEmpty()) {
//					System.out.println("불일치");
//					return;
//				}else {
//					stack.pop();
//				}
//			}
//
//		}
	}
}

