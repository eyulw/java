package day07;

class Weapon{
	int fire() {
		return 1;
	}
	
	//메서드 오버로드
//	int fire(int damage) {
//		return damage;
//	}
}

class Canon extends Weapon{
	//오버라이딩 -> 메소드이름, 매개변수 타입과 개수, 리턴타입이 모두 동일해야함
	@Override
	int fire() {
		return 10;
	}
	
	void test() {
		System.out.println("test");
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage = weapon.fire();
		System.out.println("Weapon의 데미지는 "+weaponDamage);
		
		//동적바인딩 - 실행단계에서 매칭
		weapon = new Canon();
		int canonDamage = weapon.fire();
		System.out.println("Canon의 데미지는 "+canonDamage);
		
//		weapon.test();	//불가능
	}
}
