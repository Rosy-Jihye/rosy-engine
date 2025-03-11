package kosa.basic;

public class Test {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "Hello";
		boolean result = a==b;
		System.out.println(result);
		
		String c = new String("Hello");
		String d = new String("Hello");
		boolean result2 = c==d;
		System.out.println(result2);
		
	}

}
