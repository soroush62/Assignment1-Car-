class Car
{
	//Defining attributes
	public String Brand;
	public String Color;
	public boolean isOn;
     //Defining default constructors
public Car()
{
	Brand="";
	isOn=false;
	Color="";
}
public Car(String Brand)
{
	this.Brand=Brand;
	isOn=false;
	Color="Blue";
}
public Car(String BrandName, String CarColor)
{
	Brand=BrandName;
	isOn=false;
	Color=CarColor;
}
//Defining methods
public void SwithOn()
{
	isOn = true;
}
public void SwithOff()
{
	isOn = false;
}
public void printData()
{
	System.out.println("Object = " + Brand);
	System.out.println("Car Color is " + Color);
}
public void changeValues(String BrandName, String CarColor)
{
	Brand=BrandName;
	Color=CarColor;
	System.out.println("BrandName is " + Brand +" "+"and the color of car is  "+ Color);
}
}
