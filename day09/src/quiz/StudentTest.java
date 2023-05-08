package quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
	private String name ,id,department;
	private double grade;
	public Student(String name, String id, String department, double grade) {
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
		System.out.println("이름 : "+ name);
		System.out.println("id : "+ id);
		System.out.println("학과 : "+ department);
		System.out.println("성적 : "+ grade);
		System.out.println("---------------------");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + ", grade=" + grade + "]";
	}
}

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		//4명의 학생 생성해서 StudentList에 넣기
		studentList.add(new Student("장은진","11","Java",4.5));
		studentList.add(new Student("안현우","22","JavaScript",4.5));
		studentList.add(new Student("장선영","33","Oracle",4.5));
		studentList.add(new Student("장문선","44","Spring",4.5));
		
		//모든 학생의 정보를 출력해보기 (iterator 이용)
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			it.next().showInfo();
		}
		
		//while문 돌려서 이름을 입력받아 정보 출력하기 exit입력시 종료
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("학생 이름을 입력하면 학생 정보를 알려드립니다. 종료는 exit를 입력하세요");
			String name= scanner.next();
			if(name.equals("exit")) break;
			int i;
			for(i=0;i<studentList.size();i++) {
				Student student=studentList.get(i);
				if(student.getName().equals(name)) {
					student.showInfo();
					break;
				}
			}
			if(i==studentList.size()) {
				System.out.println("없는 학생입니다.");
			}
		}
	}
}
