package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScore {
	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("정진영", 85);
		score.put("안현우", 88);
		score.put("장은진", 90);
		score.put("최수민", 95);
		score.put("박태은", 92);
		
		//HashMap 순서보장X
		//HashMap 반복문 돌리려면 key를 얻어와야함
		//Set 중복허용X -> key값 같으면 하나만 출력
		Set<String> keyList = score.keySet();
		Iterator<String> it = keyList.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+" : "+num);
		}
		
	}
}
