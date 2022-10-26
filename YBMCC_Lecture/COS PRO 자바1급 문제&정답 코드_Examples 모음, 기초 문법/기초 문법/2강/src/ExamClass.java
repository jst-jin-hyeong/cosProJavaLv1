class Car1{
	String model="SM3";
	int price=2000;
	
	void sale(int price) {
		this.price=this.price-price;
	}
}

class Car1_1{
	String model;
	int price;
	
	Car1_1(){
		this.model="SM5";
		this.price=3000;	
	}
	
	void sale(int price) {
		this.price=this.price-price;
	}
}

class Car2{
	private String model;
	private int price;
	
	Car2(String model, int price){
		this.model=model;
		this.price=price;	
	}
	
	void sale(int price) {
		this.price=this.price-price;
	}
	
	String getModel() {
		return this.model;
	}
	
	int getPrice() {
		return this.price;
	}
	
	void setPrice(int price) {
		this.price=price;
	}
}
public class ExamClass {
	public static void main(String[] args) {
		//Car1 클래스 예시
		Car1 newCar1 = new Car1();
		System.out.println(newCar1.model);
		System.out.println(newCar1.price);
		
		newCar1.price=1500;
		System.out.println(newCar1.price);
		
		newCar1.sale(200);
		System.out.println(newCar1.price);
		
		//Car1_1 클래스 예시		
		Car1_1 newCar1_1 = new Car1_1();
		newCar1_1.sale(200);
		System.out.println(newCar1_1.model);
		System.out.println(newCar1_1.price);
		
		//Car2 클래스 예시		
		Car2 newCar2 = new Car2("Sonata",2500);
		newCar2.sale(200);
		
		//System.out.println(newCar2.model);
		System.out.println(newCar2.getModel());
		
		//newCar2.price=2000;
		newCar2.setPrice(2000);
		System.out.println(newCar2.getPrice());

	}
}

