
public class ExamString {
	public static void main(String[] args) {
		
		String s1 ="test";
		String s2 = "test";
		
		if (s1==s2)
			System.out.println("s1과 s2의 값이 같다");
		else
			System.out.println("s1과 s2의 값이 다르다");

		String s3= new String("test");
		String s4 = new String("test");
		
		if (s3==s4)
			System.out.println("s3과 s4의 주소값이 같다");
		else
			System.out.println("s3과 s4의 주소값이 다르다");
		
			
	}
}
