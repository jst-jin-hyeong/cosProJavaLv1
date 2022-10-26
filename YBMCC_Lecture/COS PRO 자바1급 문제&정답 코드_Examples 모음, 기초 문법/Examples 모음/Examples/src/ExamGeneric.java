class Computer{
	public String toString() {
		return "computer";
	}
}

class TV{
	public String toString() {
		return "TV";
	}
}


class Box<T>{
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
public class ExamGeneric {
	public static void main(String[] args) {
		Box<Computer> a = new Box<Computer>();
		Box<TV> b = new Box<TV>();
		a.set(new Computer());
		b.set(new TV());
		
		Computer mycom=a.get();
		TV mytv=b.get();
		
		System.out.println(mycom);
		System.out.println(mytv);
		
	}
	
}
