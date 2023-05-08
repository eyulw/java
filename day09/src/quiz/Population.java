package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		HashMap<String,Integer> nations =new HashMap<>();
		nations.put("한국", 5000);
		nations.put("미국", 25000);
		nations.put("중국", 100000);
		nations.put("인도", 120000);
		nations.put("일본", 15000);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("나라를 입력하면 인구수를 알려드립니다. exit를 입력하면 빠져 나갑니다. ");
			String nation= scanner.next();
			if(nation.equals("exit")) break;
			Integer population = nations.get(nation);	//Integer로 박싱하면 null값 이용 가능
			if(population==null) {
				System.out.println("해당국가 없음");
			}else {
				System.out.println(nation+"의 인구는 "+population+"만명");
			}
		}
		scanner.close();
	}
}
