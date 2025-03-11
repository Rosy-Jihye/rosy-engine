package kosa.basic;

public class ExceptionExam {
	
	public static void noEquals(int a, int b)throws Exception {
		if(a==b) {
			throw new Exception("같은 값 안돼");
			
		}
	}

	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			noEquals(10,10);
			System.out.println("2");//예외발생하면 이것은 출력되지 않음 //예외가 발생하지 않으면 출력
		} catch (Exception e) {
			System.out.println("3");//예외가 있으면 catch로 가서 3 출력되고 //예외가 없으면 catch로 안가서 3출력되지 않음
			e.printStackTrace();//에러메시지 출력
		}finally {
			System.out.println("4");//예외있든 없든 finally는 어쨌든 출력
		}
		System.out.println("5");//try, catch로 잡았으니 5도 출력 //예외 없으면 이상 없으니 5도 출력

	}

}
