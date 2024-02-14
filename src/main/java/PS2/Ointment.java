package PS2;

public class Ointment  implements MedicineInfo{

	  private String name;
	    private String address;

	    // Constructor with parameters
	    public Ointment(String name, String address) {
	        this.name = name;
	        this.address = address;
	    }

	    @Override
	    public void displayLabel() {
	        System.out.println("Ointment: For external use only");
	        System.out.println("Company Name: " + name);
	        System.out.println("Company Address: " + address);
	    }
}
