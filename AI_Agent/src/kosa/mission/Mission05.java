package kosa.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// ���ڿ� �������� ���ϰڴ�=>���ڿ�.equals("���ڿ�")
		
		//String a="aaa";
		//String b="bbb";
		
		//if(a.equals(b)) {
		//	System.out.println("����");
		//}else {
		//	System.out.println("Ʋ����");
		//}

		
		//�� ������ ������ ���ڿ��� �Է� �޽��ϴ�.
		//��Ģ���� ���� ����� ����.
		//ex>����1: 50
		//	   ����2: 20
		//	   ������:+
		//���>70
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� 1:");
		double num1=Integer.parseInt(sc.nextLine());
		System.out.print("���� 2:");
		double num2=Integer.parseInt(sc.nextLine());
		System.out.print("������:");
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
		
		System.out.println("���:"+result);
		
		

				
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
//		System.out.println("���:"+result);
	}

}
