package PS2;

public class Syrup implements MedicineInfo {

	  private String name;
	    private String address;

	    // Constructor with parameters
	    public Syrup(String name, String address) {
	        this.name = name;
	        this.address = address;
	    }

	    @Override
	    public void displayLabel() {
	        System.out.println("Syrup: Shake well before use");
	        System.out.println("Company Name: " + name);
	        System.out.println("Company Address: " + address);
	    }
}
