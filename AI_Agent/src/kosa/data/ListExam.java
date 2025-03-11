package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("����");
//		list.add("����");
//		list.add("������");
//		
//		int num=list.size();
//		for(int cnt=0;cnt<num;cnt++) {
//			String str = list.get(cnt);
//			System.out.println(str);
//		}
		
		//1~45 �ߺ����� �ʴ� �ζǹ�ȣ 6�� �������.
		Random r = new Random();
		
		//1. �迭����
//		int arr[] = new int[6];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = r.nextInt(45)+1; //0���� 44������ ������ ���� ����
//			for(int j =0;j<i;j++) {
//				if(arr[i] == arr[j])
//					i=i-1;//���Ƽ� i�� �پ��� �ٽ� +�Ǿ ���� �Է¹���
//			}
//		}
//		
//		Arrays.sort(arr); //�迭�� ��ҵ��� ������������ ����
//		System.out.println(Arrays.toString(arr)); //���� ��ҵ��� ���ڿ� ���·� ��ȯ�Ͽ� [���1, ���2, ���3, ...] �������� ��ȯ
		
		//2. List ����
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int n = r.nextInt(45)+1;
			if(list.contains(n)) {
				continue; //�ߺ��Ǹ� �ٽ� �޾ƶ�
			}else {
				list.add(n);
			}
			if(list.size()==6) break;					
		}
		
//		Collections.sort(list);
//		System.out.println(list); //ArrayList�� toString���� ����ϴ� �޼��尡 �־ �̷��� ��� �迭 ���·� ���
				
//		
//		Collections.sort(list);
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+",");  //for�� �ȿ����� get �޼��� �����
//		}
//		System.out.println(list);
		
		
		Collections.sort(list); //sort(��������)�� ���� ���� Collections Ŭ���� ��ȯ
		
		Iterator <Integer> iter = list.iterator();  //for��ó�� ������ ����
		
		while(iter.hasNext()) { //ù��° ��Ұ� �ֽ��ϱ�? �� ���� �ι�° �ֽ��ϱ�?
			System.out.print(iter.next()+","); //������ ���, �� ������ ���
		}
		
		
		//3. Set ����(TreeSet)=>�ߺ� ���x
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		for(int i=0;set.size()<6;i++) { //size�� 6�� �Ǳ� ������ �ݺ�. �� 6�� �ݺ�. Treeset�� �ߺ� �����ؼ� �ߺ����� �ʰ� 6�� �� ����
//			set.add(r.nextInt(45)+1);
//		}
//		System.out.println(set);
		
		
	}

}
