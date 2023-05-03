package other;

import day07.Person;

public class Student extends Person {
	public void set() {
		this.height=185;	//다른 패키지지만 상속받았기때문에 사용가능
		this.setWeight(90);	
		this.name="홍길동";
		
		//Person의 age는 default이기때문에 다른패키지에서는 사용불가능
	}
}
