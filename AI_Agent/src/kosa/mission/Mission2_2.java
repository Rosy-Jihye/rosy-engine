package kosa.mission;

import java.util.Scanner;

public class Mission2_2 {

	public static void main(String[] args) {
		// �����������α׷����� �������� ���������� �����غ���.
		// 1��(����, ����, ����, ����, ���)=>int arr[]=new int[5];
		// 10��(����, ����, ����, ����, ���)=int arr[][]=new int[10][5];
		//��ȣ  ����  ����   ����   ����    ���
		//  1    90  80    70   240    80
		//  2    50  40    30   120    40
		//==================
		//       140  120  100
		//         70    60    50
		

		int score[][]= {{90,80,70}, {50,40,30}};
		
		//���� ����
		int korTotal=0;
		int engTotal=0;
		int matTotal=0;
		
		System.out.println("��ȣ ����\t����\t����\t����\t���");
		
		for(int i=0;i<score.length;i++) {
			int sum = 0;
			int avg = 0;
			
			korTotal+=score[i][0];
			engTotal+=score[i][1];
			matTotal+=score[i][2];
			
			System.out.print((i+1)+"\t");
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
				System.out.print(score[i][j]+"\t");
							
				
			}
			
			avg=sum/score[i].length;
			System.out.print(sum+"\t");
			System.out.print(avg+"\t");					
			System.out.println();
			
		}
		
		System.out.println("===================");
		

			
		System.out.print("\t"+korTotal);
		System.out.print("\t"+engTotal);
		System.out.println("\t"+matTotal);

			
		System.out.print("\t"+korTotal/score.length);
		System.out.print("\t"+engTotal/score.length);
		System.out.print("\t"+matTotal/score.length);
		
			

	}

}
