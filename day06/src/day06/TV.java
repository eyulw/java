package day06;

public class TV {
	//company(회사), year(몇년도),size
	//showInfo()를 통해서 제품 정보 출력
	private String company;
	private int year;
	private int size;
	
	public TV() {
		
	}
	
	public TV(String company, int year,int size) {
		this.company=company;
		this.year=year;
		this.size=size;
	}
	
	public void showInfo() {
		System.out.println("우리집 tv는 "+this.company+
				"이고 "+this.year+"년도에 생산되었고 "+
				this.size+"인치 입니다.");
	}
}
