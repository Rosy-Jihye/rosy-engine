package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		//Ű����κ��� ���� ������ �Է�
		//((2+3)+10)=>��ȣ ��ġ/����ġ �Ǵ�
		//������ ���� ���߿� ���´�
		
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		
		System.out.println("�����Է�: ");
		String str = sc.nextLine();
		
		try {
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				
				if(ch =='(') { //ch�� ���� ����ǥ, str�� ū ����ǥ //���� ��ȣ�� ������ stack�� ���� ��ȣ�� �ִ´�.
					stack.push(ch+""); //ch�� str���� ��ȯ
				}else if(ch==')') { 
					stack.pop(); //�ݴ� ��ȣ�� ������ stack�� ���ִ� ���� ��ȣ �� ���� �������� �� �ͺ��� ���� //�� ���� �����ϸ� ���� �߻���Ŵ
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			}else {
				System.out.println("��ȣ�� ����ġ�մϴ�.");
			}
			
			
		}catch (Exception e) {
			System.out.println("��ȣ�� ����ġ�մϴ�.");
		}

//		for(int i=0;i<math.length();i++) {
//			if(math.charAt(i)=="(") {
//				stack.push(math.charAt(i))+"";	
//			} else if (math.charAt(i)==")") {
//				if (stack.isEmpty()) {
//					System.out.println("����ġ");
//					return;
//				}else {
//					stack.pop();
//				}
//			}
//
//		}
	}
}

