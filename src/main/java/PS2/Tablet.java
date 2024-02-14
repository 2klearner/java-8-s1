package PS2;

public class Tablet implements MedicineInfo {
    private String name;
    private String address;

    // Constructor with parameters
    public Tablet(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void displayLabel() {
        System.out.println("Tablet: Store in a cool, dry place");
        System.out.println("Company Name: " + name);
        System.out.println("Company Address: " + address);
    }
}