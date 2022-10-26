abstract class Shape{
	abstract double area();
}

class RectShape extends Shape{
	int r;
	
	RectShape(int r){
		this.r=r;
		}
	
	double area() {
		return r*r;
	}
}

public class ExamAbstract {
	public static void main(String[] args) {
		
		RectShape rect1 = new RectShape(5);
		
		System.out.println(rect1.area());
		
	}
}
