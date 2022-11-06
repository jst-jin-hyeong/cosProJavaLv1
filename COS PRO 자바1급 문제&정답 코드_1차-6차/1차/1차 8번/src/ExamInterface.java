interface Dad1{
	public void sing1() ;
}

interface Mom1{
	public void math1();
}

class Child1 implements Dad1,Mom1{
	@Override
	public void sing1() {
		System.out.println("노래를 잘 부른다");
	}
	@Override
	public void math1() {
		System.out.println("수학을 잘 한다");
	}
	
	void dance1() {
		System.out.println("춤을 잘 춘다");
	}
}

public class ExamInterface {

	public static void main(String[] args) {

    Child1 c=new Child1();
    c.sing1();
    c.math1();
    c.dance1();
	}

}
