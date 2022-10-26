class CarCons{
	String model;
	int price;
		
	public CarCons(String model, int price){
		this.model=model;
		this.price=price;	
	}
	
	void sale(int price) {
		this.price=this.price-price;
	}
}

public class ExamClassConstructor {
	public static void main(String[] args) {
		CarCons carCons1 = new CarCons("Avante",1000);
		System.out.println(carCons1.model);
		System.out.println(carCons1.price);		
 
		//CarCons carCons2 = new CarCons();
	}
}

