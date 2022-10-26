class Dad3{
	void sing() {
		System.out.println("노래를 잘한다");
	}
}

class Child3 extends Dad3{
	void sing() {
		System.out.println("랩을 잘한다\n");
	}
	void callSuper() {
		System.out.println("Super call-start");
		super.sing();
		System.out.println("Super call-end\n");
		//this.sing(); 
	}
}

public class ExamOverriding2 {

	public static void main(String[] args) {

    Child3 c1=new Child3();
    c1.sing();
    c1.callSuper();
    
    Dad3 c2=new Child3();
    c2.sing();
   // c2.callSuper();   //error
	}

}
