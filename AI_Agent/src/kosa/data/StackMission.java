package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		//키보드로부터 수학 수식을 입력
		//((2+3)+10)=>괄호 일치/불일치 판단
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수학식을 입력하세요.");
		String math = sc.nextLine();
		
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<math.length();i++) {
			if(math.charAt(i)=="(") {
				stack.push(math.charAt(i))+"";	
			} else if (math.charAt(i)==")") {
				if (stack.isEmpty()) {
					System.out.println("불일치");
					return;
				}else {
					stack.pop();
				}
			}

		}
	}
}

