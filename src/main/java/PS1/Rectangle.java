package PS1;

public class Rectangle {

	//Variables
	public double length;
	public double breadth;

	//No-args Cons
	public Rectangle() {
		length=0;
		breadth=0;
	}

	//Parameterized Cons
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	//Accessor Methods
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	//Pure Functions
	//To Calculate Area
	public double Area(){
		return length*breadth;
	}

	//Display All info
	public void displayInfo() {
		System.out.println("Rectangle Information:");
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Area: " + Area());
	}



}
