package kosa.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// 로그인 예제를 구현해보자.
		// id, pass 키보드로부터 입력
		// 기존 m_id, m_pass 모두 일치하면 =>로그인 성공
		// id가 불일치 =>해당 아이디가 존재하지 않습니다.
		// pass가 불일치 =>비밀번호가 일치하지 않습니다.
		
		String m_id = "kosa";
		String m_pass = "1234";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("ID : ");
		String id=sc.nextLine();
		System.out.print("Password : ");
		String pass=sc.nextLine();
				
		
		if(id.trim().equals(m_id)&&pass.trim().equals(m_pass)) {
			System.out.println("로그인 성공");//trim : 앞뒤에 있는 공백문자 제거해줌.
		} else {
			if(!id.equals(m_id)) {
				System.out.println("해당 아이디가 존재하지 않습니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
//		while(true) {
//			System.out.print("ID : ");
//			String id=sc.nextLine();
//			if(id.equals(m_id)) {
//				System.out.print("Password : ");
//				String pass=sc.nextLine();
//					if(pass.equals(m_pass)) {
//						System.out.println("로그인 성공");
//						break;
//					}else {
//						System.out.println("비밀번호가 일치하지 않습니다.");
//					}
//			}else {
//				System.out.println("해당 아이디가 존재하지 않습니다.");
//			}
//			
//		}
		
	}
	
}