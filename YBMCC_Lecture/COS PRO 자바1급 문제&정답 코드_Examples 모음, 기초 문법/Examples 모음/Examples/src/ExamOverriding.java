class Dad2{
	void sing() {
		System.out.println("노래를 잘한다");
	}
}

class Child2 extends Dad2{
	void sing() {
		System.out.println("랩을 잘한다");
	}
}

public class ExamOverriding {

	public static void main(String[] args) {

    Child2 c1=new Child2();
    c1.sing();
    
    Dad2 c2=new Child2();
    c2.sing();
	}
}

