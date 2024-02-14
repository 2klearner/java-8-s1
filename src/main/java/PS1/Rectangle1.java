package PS1;

public class Rectangle1 {

	//Variables
	public double length;
	public double breadth;

	//No-args Cons
	public Rectangle1() {
		length=1;
		breadth=1;
	}

	//Parameterized Cons
	public Rectangle1(double length, double breadth) {
		super();
		setLength(length);
		setBreadth(breadth);
	}


	//Accessor Methods
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (isValidLength(length)) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length should be between 0.0 and 20.0 exclusive.");
        }
		
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		if (isValidBreadth(breadth)) {
            this.breadth = breadth;
        } else {
            throw new IllegalArgumentException("Breadth should be between 0.0 and 20.0 exclusive.");
        }	}

	//Pure Functions
	//To Calculate Area
	public double Area(){
		return length*breadth;
	}

	public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
	
	
	// Private helper methods for validation
    private boolean isValidLength(double length) {
        return length > 0.0 && length < 20.0;
    }

    private boolean isValidBreadth(double breadth) {
        return breadth > 0.0 && breadth < 20.0;
    }
	//Display All info
	public void displayInfo() {
		System.out.println("Rectangle Information:");
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Area: " + Area());
	}



}
