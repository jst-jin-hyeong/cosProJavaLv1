class Dad2{
	void sing() {
		System.out.println("�뷡�� ���Ѵ�");
	}
}

class Child2 extends Dad2{
	void sing() {
		System.out.println("���� ���Ѵ�");
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

