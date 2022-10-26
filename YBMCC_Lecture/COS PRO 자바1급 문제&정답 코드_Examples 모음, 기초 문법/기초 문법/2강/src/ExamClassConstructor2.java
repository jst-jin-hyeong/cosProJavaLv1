class CarCons2{
	String model;
	int price;
		
	public CarCons2(){
	}
	
	public CarCons2(String model){
		this.model=model;
	}
	
	public CarCons2(int price){
		this.price=price;	
	}
	
	void sale(int price) {
		this.price=this.price-price;
	}
}

public class ExamClassConstructor2 {
	public static void main(String[] args) {		 
		CarCons2 carCons1 = new CarCons2();	
	}
}

