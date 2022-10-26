
public class ExamStringMethod {

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println("str.charAt(2):" + str.charAt(2));
		System.out.println("str.isEmpty():" + str.isEmpty());	
		System.out.println("str.length():" + str.length());
		
		char[] charArr = str.toCharArray();
		System.out.print("str.toCharArray(): ");
		System.out.println(charArr);
		System.out.println(charArr[0]);
		//Arrays.toString()은 배열을 문자열로 반환
		
		System.out.println("str.replace():" + str.replace("bc","goo"));
		
		System.out.println("str.startsWith():" + str.startsWith("a"));
		System.out.println("str.endsWith():" + str.endsWith("a"));
		
		System.out.println("str.equals():" + str.equals("good"));
		
		
		String str2 = "abcd";
		int i = str2.indexOf("cd");
		System.out.println("str2.indexOf(cd):"+ i);
		
		i = str2.indexOf("c");
		System.out.println("str2.indexOf(c):"+ i);
		
		System.out.println("String.valueOf():"+ String.valueOf(3) );
	
		
		String str3="123+12";
		System.out.println("substring()-1:"+ str3.substring(2));
        System.out.println("substring()-2:"+ str3.substring(1,4));
        
        String str4="123,12,564";
        String[] splitStr = str4.split(",");
        System.out.println("split()-1:"+splitStr[0]);
        System.out.println("split()-2:"+splitStr[1]);
        
	}

}
