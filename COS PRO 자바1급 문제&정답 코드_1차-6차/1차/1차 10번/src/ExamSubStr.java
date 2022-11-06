
public class ExamSubStr {
	public static void main(String[] args) {
		
		String str="abcd";
		char c = str.charAt(2);
		
		System.out.println(c);
		
		
		String str2="abcd";
		int i = str2.indexOf("cd");
		System.out.println(i);
		i = str2.indexOf("c");
		System.out.println(i);
		
		
		String exp="123+12";
		
        System.out.println(exp.substring(2));
        System.out.println(exp.substring(1,4));
        
		
	}
}
