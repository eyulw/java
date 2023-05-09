package day10;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		/*
		 * File 클래스
		 * 	> 파일의 경로명을 다루는 클래스
		 * 	> 파일 관리 기능
		 * 		- 파일 이름 변경, 삭제, 디렉터리 생성, 크기 등 파일 관리
		 * 		- File 객체는 파일 읽고 쓰기 기능 없음
		 */
		//파일 객체 생성
		File file01 = new File("C:\\Windows\\system.ini");	//특수문자사용할때 \사용(\",\',\\)
		//파일의 경로명
		System.out.println(file01.getPath());
		System.out.println(file01.getName());
		System.out.println(file01.getParent());
		//파일인지 디렉토리인지 구분
		System.out.println(file01.isFile());
		System.out.println(file01.isDirectory());
		//파일의 크기
		System.out.println(file01.length());
		
		File file02 = new File("C:\\temp\\sample");	//확장자 생략하면 폴더
		if(!file02.exists())	//존재하지않으면
			file02.mkdir();		//폴더 생성
		file02.renameTo(new File("C:\\temp\\java_sample"));	//파일명을 변경
		
		//서브 디렉터리 리스트 얻기
		File file03 = new File("C:\\temp");
		File[] subFiles = file03.listFiles();
		for(int i=0; i<subFiles.length;i++) {
			File file = subFiles[i];
			System.out.println(file.getName());
		}
	}
}
