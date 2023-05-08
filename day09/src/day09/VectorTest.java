package day09;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		/*
		 * Vector<E> : 여러 객체들을 삽입,삭제,검색하는 컨테이너 클래스
		 * 				배열의 길이 제한 극복
		 * 				원소의 개수가 넘쳐나면 자동으로 길이 조절
		 * 				객체,null 삽입 가능
		 * 				기본 타입은 Wrapper 객체로 만들어 저장
		 * 				맨뒤에 객체 추가 or 중간에 객체 삽입
		 * 				임의의 위치에 있는 객체 삭제 가능 - 객체 삭제 후 자동 자리 이동
		 */
		Vector<Integer> vec = new Vector<>();
		vec.add(5);
//		vec.add(null);		//null허용
		vec.add(3);
		vec.add(1);
		
		vec.add(1, 100);	//인덱스 1번에 100넣음
		
//		System.out.println(vec.size());
//		System.out.println(vec.get(0));
//		System.out.println(vec.get(1));
		
		System.out.println(vec.capacity());		//메모리 차지하는 용량. size()랑 다름
		
		for(int i=0; i<vec.size(); i++) {
			System.out.print(vec.get(i)+" ");
		}
		
		System.out.println();
		
		for(int num:vec) {
			System.out.print(num +" ");
		}
		
	}
}
