class Dad{
	void sing() {
		System.out.println("노래를 잘 한다");
	}
}

class Child extends Dad{
	void dance() {
		System.out.println("춤을 잘 춘다");
	}
}

public class ExamInheritance {

	public static void main(String[] args) {

    Child c=new Child();
    c.sing();
    c.dance();
	}

}
