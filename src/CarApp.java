
public class CarApp {

	public static void main(String[] args) {
		//Create tow objects : car1 and car2
		Car car1 = new Car();
		Car car2 =new Car("BMW");
		Car car3 =new Car("Audi","Black");
//		if (car1.isOn)
//		{
//			System.out.println("The car1 is SwithOn");
//		}

		//Assigning method to objects
//		car1.printData();
		car2.printData();
		car3.printData();
		car3.changeValues("Tesla","White");

	}

}


