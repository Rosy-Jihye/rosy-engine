package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		//Ű����κ��� ���� ������ �Է�
		//((2+3)+10)=>��ȣ ��ġ/����ġ �Ǵ�
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���н��� �Է��ϼ���.");
		String math = sc.nextLine();
		
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<math.length();i++) {
			if(math.charAt(i)=="(") {
				stack.push(math.charAt(i))+"";	
			} else if (math.charAt(i)==")") {
				if (stack.isEmpty()) {
					System.out.println("����ġ");
					return;
				}else {
					stack.pop();
				}
			}

		}
	}
}

