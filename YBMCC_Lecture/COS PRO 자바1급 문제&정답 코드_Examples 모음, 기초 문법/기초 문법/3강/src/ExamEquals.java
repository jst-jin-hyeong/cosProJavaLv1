
public class ExamEquals {

	public static void main(String[] args) {

		String a = "test";
		String b = "test";
		String c = new String("test");
		String d = new String("test");
		
		System.out.println(a == b); //true
		System.out.println(c == d); //false
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		System.out.println(a.equals(b)); //true
		System.out.println(c.equals(d)); //true
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));

		
		String a1 = "test";
		String b1 = "test2";
		String c1 = new String("test");
		String d1 = new String("test2");
		
		System.out.println(a1 == b1); //false
		System.out.println(c1 == d1); //false
		
		System.out.println(a1.equals(b1)); //false
		System.out.println(c1.equals(d1)); //false
		System.out.println(b1.equals(c1)); //false
		System.out.println(b1.equals("test2")); //true
		System.out.println(d1.equals("test2")); //true
	}
}
