package day08;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("this");
		sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7, " my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		sb.delete(8, 13);
		System.out.println(sb);
		sb.setLength(4);
		System.out.println(sb);
		//sb는 String이 아니기때문에 String에 있는 메소드 쓰려면 sb.toString()을 하고 써야함
//		String str=sb.toString();	
	}
}
