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
		
		//����>Ű����κ��� ���ڿ��� �Է¹޾� �迭�� �߰��� �� ��ü�� �������.
		//"q"�� �Է��� ������ ����ؼ� �Է¹޾� �迭�� �߰��ϵ��� �Ѵ�.(q�Է��ϸ� �Է� ����ǰ� ���ݱ��� �Է��� �� ������)
		//ex>�Է�: ȫ�浿
		//		�Է�: ��浿
		//		�Է�: �ڱ浿
		//		�Է�: q
		//���>ȫ�浿, ��浿, �ڱ浿

		Scanner sc=new Scanner(System.in);
			
		String sArr[]=new String[10];//String []sArr �ص� ��.
		//������1 : �迭�� �ѹ� �����ϸ� �þ�� ����.
		//������ 2 : �迭�� ���� ������ Ÿ�Ը� ���� �� ����.
		int count=0; //�ε��� ���� ����� �� �ִ� ���� ���� *�߿�!!
		
		while(true) {
				System.out.print("�Է�: ");
				String str=sc.nextLine(); //Ű���� ������ �о���δ�
				
				if(str.equals("q")|str.equals("Q")) break; //q�� �Է��ϸ� �ߴ�
				sArr[count++]=str; //++count�� �ϸ� 1���� ������
				}

		for(int i=0;i<count;i++) {
				System.out.print(sArr[i]);
				if(i<count-1) {
					System.out.print(",");
				}
				}
		//������3 : ���� ī��Ʈ�ϱ� �������� �����Ͱ� ���° �迭���� ������ �� so for���� sArr.length�� �ƴ� count�� �ִ´�.
		
		}
		}
		

