
public class ClassesAndObjects {

	public static void main(String[] args) {
		
		Car myCar = new Car("Tata","Nexon",1643552.75);
		
		myCar.displayInfo();
		
	}

}

class Car{
	String brand;
	String modelName;
	double onRoadPrice;
	
	public Car(String brand, String modelName, double onRoadPrice) {
		this.brand = brand;
		this.modelName = modelName;
		this.onRoadPrice = onRoadPrice;
	}
	
	public void displayInfo() {
		System.out.println("Brand: "+brand+"\nModel: "+modelName+"\nOnRoad price: "+onRoadPrice);
	}
	
}
