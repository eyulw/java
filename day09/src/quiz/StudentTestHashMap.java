package quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student02 {
	private String name, id, department;
	private double grade;

	public Student02(String name, String id, String department, double grade) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void showInfo() {
		System.out.println("---------------------");
		System.out.println("이름 : " + name);
		System.out.println("id : " + id);
		System.out.println("학과 : " + department);
		System.out.println("성적 : " + grade);
		System.out.println("---------------------");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + ", grade=" + grade + "]";
	}
}

public class StudentTestHashMap {
	public static void main(String[] args) {
		HashMap<String, Student02> studentMap = new HashMap<>();
		studentMap.put("장은진", new Student02("장은진", "11", "Java", 4.5));
		studentMap.put("안현우", new Student02("안현우", "22", "JavaScript", 4.5));
		studentMap.put("장선영", new Student02("장선영", "33", "Oracle", 4.5));
		studentMap.put("장문선", new Student02("장문선", "44", "Spring", 4.5));

		// iterator 이용해서 반복문 만들어보기
		Set<String> studentKey = studentMap.keySet();
		Iterator<String> it = studentKey.iterator();
		
		//forEach문으로 key,value값 둘 다 들고오기
		for(Map.Entry<String,Student02> item : studentMap.entrySet()) {
			System.out.println(item.getKey()+":"+item.getValue());
		}
		
		
		while (it.hasNext()) {
			String name = it.next();
			studentMap.get(name).showInfo();
		}
		// 이름 입력했을때 출력해보기
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("학생 이름을 입력하면 학생 정보를 알려드립니다. 종료는 exit를 입력하세요");
			String name = scanner.next();
			if (name.equals("exit"))
				break;
			if (studentMap.get(name) == null) {
				System.out.println("없는 학생");
			} else {
				studentMap.get(name).showInfo();
			}
		}

	}
}
