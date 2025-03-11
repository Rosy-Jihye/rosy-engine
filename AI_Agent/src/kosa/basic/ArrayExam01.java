package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
//		int arr[];
//		arr=new int[5];
//		System.out.println(arr);
//		
//		int arr2[]=new int[5];
//		arr2[0]=10;
//		arr2[1]=20;
//		System.out.println(arr2[0]+","+arr2[1]);
//		
//		int arr3[]= {1,2,3,4,5};
//		
//		for(int i=0;i<arr3.length;i++) {
//			System.out.println("arr3["+i+"]="+arr3[i]);
//			}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr3[i]);
//			if(i<arr.length-1) {
//				System.out.print(",");
//			}
//		}
//		
		
		//퀴즈>키보드로부터 문자열을 입력받아 배열에 추가한 후 전체를 출력하자.
		//"q"를 입력할 때까지 계속해서 입력받아 배열에 추가하도록 한다.(q입력하면 입력 종료되고 지금까지 입력한 것 나오기)
		//ex>입력: 홍길동
		//		입력: 김길동
		//		입력: 박길동
		//		입력: q
		//출력>홍길동, 김길동, 박길동

		Scanner sc=new Scanner(System.in);
			
		String sArr[]=new String[10];//String []sArr 해도 됨.
		//문제점1 : 배열은 한번 생성하면 늘어나지 않음.
		//문제점 2 : 배열은 같은 데이터 타입만 담을 수 있음.
		int count=0; //인덱스 값을 기억할 수 있는 변수 선언 *중요!!
		
		while(true) {
				System.out.print("입력: ");
				String str=sc.nextLine(); //키보드 한줄을 읽어들인다
				
				if(str.equals("q")|str.equals("Q")) break; //q를 입력하면 중단
				sArr[count++]=str; //++count로 하면 1부터 시작함
				}

		for(int i=0;i<count;i++) {
				System.out.print(sArr[i]);
				if(i<count-1) {
					System.out.print(",");
				}
				}
		//문제점3 : 내가 카운트하기 전까지는 데이터가 몇번째 배열까지 들어갔는지 모름 so for문에 sArr.length가 아닌 count를 넣는다.
		
		}
		}
		

