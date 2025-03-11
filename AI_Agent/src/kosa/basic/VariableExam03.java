package kosa.basic;

public class VariableExam03 {
	public static void main(String[] args) {
		//지역(로컬) 변수 특징 2가지
		//1. 반드시 초기화 후 사용해야한다.
		//2. 선언된 변수는 정의된 범위 안에서만 사용가능하다.
		int num;
		
		if(1==1) {
			num=100;
		}
		
		System.out.println(num);
		
		//형변환(암묵적, 강제)
		//int<==>char *아스키코드값에서 따라 변환
		//char ch='A';
		//String str="A";
		
		char ch='A';
		System.out.println((int)ch);
		
		for(int i=65;i<91;i++) { // i++=>i=i+1
			System.out.print((char)i+" "); //" " : 띄어쓰기
			
		}
		
		System.out.println();
		
		//int(기본형)<==>String(Object)
		String num3="100"; //String은 문자열이기 때문에 쌍따옴표해야함
		int num4 = Integer.parseInt(num3);//num3를 숫자로 취급
		int result = num4+100;
		System.out.println(result);
	    //NumberFormatException 오류는 변수안에 숫자가 아닌 문자가 들어간 것임
		
		int num5=10;
		String num6=String.valueOf(num5);
		String num7=num5+"";
		System.out.println(num7);
		
		String str =7+"7"+7;
		System.out.println(str);
		//정수랑 string이랑 연산하면 string이 됨. 어떤 것과 string을 연산하면 string이 됨.
				
		boolean bool = false;
		
		//%=>나머지 연산자
		System.out.println((10%3));
		
		for(int i=1;i<100;i++) {
			if(!(i%2==0)|(i%3==0)){
				System.out.print(i+",");
				//2의 배수나 3의 배수가 아닌 것들만 출력하라.
			}
		}
				System.out.println(); //줄바꿈
		        //복합대입 연산자
				int n=0;
				n++;//증감자 //n+=1; //n=n+1;
				System.out.println(n);
				
				int x=10;
				int y=0;
				y=++x;//y=x++=>전달하고 더함, y=++x=>더하고 y에 전달
				System.out.println("x:"+x);
				System.out.println("y:"+y);
				
				//3.14+1=4.14
				double d =3.14+1;
				System.out.println(d);
				if(d==4.14) {
					System.out.println("맞다");
				}else {
					System.out.println("틀리다");
				}
				
				//삼항 연산자
				int b=40;
				int c=20;
				
				int max=(b>c)?b:c; //(b>c가 참이면 b, 거짓이면 c)
				System.out.println(max);
		
		}
		
	}

