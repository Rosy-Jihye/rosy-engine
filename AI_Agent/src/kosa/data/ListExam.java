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
//		list.add("포도");
//		list.add("딸기");
//		list.add("복숭아");
//		
//		int num=list.size();
//		for(int cnt=0;cnt<num;cnt++) {
//			String str = list.get(cnt);
//			System.out.println(str);
//		}
		
		//1~45 중복되지 않는 로또번호 6개 출력하자.
		Random r = new Random();
		
		//1. 배열구현
//		int arr[] = new int[6];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = r.nextInt(45)+1; //0부터 44까지의 범위의 정수 생성
//			for(int j =0;j<i;j++) {
//				if(arr[i] == arr[j])
//					i=i-1;//같아서 i가 줄어들면 다시 +되어서 새로 입력받음
//			}
//		}
//		
//		Arrays.sort(arr); //배열의 요소들을 오름차순으로 정렬
//		System.out.println(Arrays.toString(arr)); //열의 요소들을 문자열 형태로 변환하여 [요소1, 요소2, 요소3, ...] 형식으로 반환
		
		//2. List 구현
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int n = r.nextInt(45)+1;
			if(list.contains(n)) {
				continue; //중복되면 다시 받아라
			}else {
				list.add(n);
			}
			if(list.size()==6) break;					
		}
		
//		Collections.sort(list);
//		System.out.println(list); //ArrayList에 toString으로 출력하는 메서드가 있어서 이렇게 적어도 배열 형태로 출력
				
//		
//		Collections.sort(list);
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+",");  //for문 안에서는 get 메서드 써야함
//		}
//		System.out.println(list);
		
		
		Collections.sort(list); //sort(오름차순)를 쓰기 위해 Collections 클래스 소환
		
		Iterator <Integer> iter = list.iterator();  //for문처럼 돌리는 역할
		
		while(iter.hasNext()) { //첫번째 요소가 있습니까? 그 다음 두번째 있습니까?
			System.out.print(iter.next()+","); //있으면 출력, 또 있으면 출력
		}
		
		
		//3. Set 구현(TreeSet)=>중복 허용x
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		for(int i=0;set.size()<6;i++) { //size가 6이 되기 전까지 반복. 총 6번 반복. Treeset은 중복 허용안해서 중복되지 않게 6개 값 나옴
//			set.add(r.nextInt(45)+1);
//		}
//		System.out.println(set);
		
		
	}

}
