package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map : (key, value), (key, value)=>Hash Map
//		Map<String, String> map = 
//				new HashMap<String, String>();
//		
//		map.put("1","KIA");
//		map.put("2","Samsung");
//		map.put("3","LG");
//		//put�� ���� �����͸� �ִ´�
//		
//		if(map.containsValue("LG")) {
//			map.remove("3");
//		}
//		
//		System.out.println("����� ������:"+ map.size());
//		System.out.println("2����:"+map.get("2"));
//		//key�� ���� value ���� �̾Ƴ���
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("���ڹ�", 50);
		map.put("���ڹ�", 70);
		map.put("���ڹ�", 20);
		map.put("���ڹ�", 10);
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 30);
		
		//map => key ����
		Set<String> set = map.keySet();
		//key���� ����
		System.out.println("������ ���"+set);
		//Set�� ������ ���� �ߺ��� ������� ����. �׷��� ������ ���� ���� �Ͱ� �ٸ��� ��µ� �� ����
		
		
		//map=>value ����
		Collection<Integer> values = map.values();
		//map���� value ���� �ݷ��� ������Ÿ������ �����´�.
		Iterator<Integer> iter = values.iterator();
		//��ȸ�ؼ� �������� ���ؼ� iterator�� �ʿ�. �׸��� iter�� ����.
		
		int total = 0;
		while(iter.hasNext()) {
			total  += iter.next();
		}
		//iter���� 50 �ֳ���? �׷� �ְ�, ���� 90 �ֳ���? �׷� �ְ� �ϸ鼭 total�� ������ �� �ִ�.
		
		System.out.println("����: "+total);
		System.out.println("���: "+total/map.size());
		System.out.println("�ִ�: "+Collections.max(values));
		System.out.println("�ּ�: "+Collections.min(values));
		
		
		

	}

}
