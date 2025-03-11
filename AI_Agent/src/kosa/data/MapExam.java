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
//		//put을 통해 데이터를 넣는다
//		
//		if(map.containsValue("LG")) {
//			map.remove("3");
//		}
//		
//		System.out.println("요소의 사이즈:"+ map.size());
//		System.out.println("2위팀:"+map.get("2"));
//		//key를 통해 value 값을 뽑아낸다
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 50);
		map.put("박자바", 70);
		map.put("장자바", 20);
		map.put("최자바", 10);
		map.put("이자바", 90);
		map.put("송자바", 30);
		
		//map => key 추출
		Set<String> set = map.keySet();
		//key값만 리턴
		System.out.println("응시자 명단"+set);
		//Set은 순서가 없고 중복을 허용하지 않음. 그래서 순서가 내가 적은 것과 다르게 출력될 수 있음
		
		
		//map=>value 추출
		Collection<Integer> values = map.values();
		//map에서 value 값을 콜렉션 데이터타입으로 가져온다.
		Iterator<Integer> iter = values.iterator();
		//순회해서 가져오기 위해서 iterator가 필요. 그리고 iter에 넣음.
		
		int total = 0;
		while(iter.hasNext()) {
			total  += iter.next();
		}
		//iter에서 50 있나요? 그럼 넣고, 다음 90 있나요? 그럼 넣고 하면서 total에 총점이 들어가 있다.
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+total/map.size());
		System.out.println("최대: "+Collections.max(values));
		System.out.println("최소: "+Collections.min(values));
		
		
		

	}

}
