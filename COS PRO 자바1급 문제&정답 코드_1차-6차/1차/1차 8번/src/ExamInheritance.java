class Dad{
	void sing() {
		System.out.println("�뷡�� �� �Ѵ�");
	}
}

class Child extends Dad{
	void dance() {
		System.out.println("���� �� ���");
	}
}

public class ExamInheritance {

	public static void main(String[] args) {

    Child c=new Child();
    c.sing();
    c.dance();
	}

}
