package kosa.basic;

public class CallByExam {
	
//	public static void change(int num) { //한 함수 안에 정의된 변수는 그 안에서만
//		num+=10; //num을 10증가
//	}
//
//	public static void main(String[] args) {
//		int num=10;
//		change(num);
//		System.out.println(num);
//
//	}
//이렇게 하면 결과가 10
	
//	public static int change(int num) {
//		num+=10; //num을 10증가
//		return num;//20. 메소드에 리턴값으로 해야 아래 함수에 반영할 수 있음
//	}
//
//	public static void main(String[] args) {
//		int num=10;
//		num=change(num);
//		System.out.println(num);

	
	public static int change(int num) {
		num+=10; //num을 10증가
		return num;//20. 메소드에 리턴값으로 해야 아래 함수에 반영할 수 있음
	}

	public static void chang2(int brr[]) {//주소값을 brr에 부여하여 같은 값을 참조할 수 있음.
		brr[0]=200;//brr을 200으로 변경
		//이제 arr은 brr은 같은 주소를 갖고 있기 때문에 리턴할 필요가 없다.
		//아까는 리턴하지 않으면 값이 변경되지 않았기 때문에 리턴을 해준 것임.
	}
	
	public static void main(String[] args) {
//		int num=10;
//		int num1=change(num);
//		System.out.println(num1);
//	}
	
	int arr[]= {100};
	chang2(arr);//주소값임
	System.out.println(arr[0]);

	
}
}
