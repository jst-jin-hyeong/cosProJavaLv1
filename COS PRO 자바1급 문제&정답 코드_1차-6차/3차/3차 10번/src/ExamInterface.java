interface Dad1{
	public void sing1() ;
}

interface Mom1{
	public void math1();
}

class Child1 implements Dad1,Mom1{
	@Override
	public void sing1() {
		System.out.println("�뷡�� �� �θ���");
	}
	@Override
	public void math1() {
		System.out.println("������ �� �Ѵ�");
	}
	
	void dance1() {
		System.out.println("���� �� ���");
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
