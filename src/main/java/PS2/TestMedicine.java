package PS2;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MedicineInfo[] medicines = new MedicineInfo[10];

	        // Create a medicine object of the type as decided by a randomly generated integer
	        Random random = new Random();

	        for (int i = 0; i < medicines.length; i++) {
	            int randomMedicineType = random.nextInt(3) + 1;

	            // Use Lambda Expressions to implement MedicineInfo interface
	            switch (randomMedicineType) {
	                case 1:
	                    medicines[i] = () -> System.out.println("Tablet: Store in a cool, dry place");
	                    break;
	                case 2:
	                    medicines[i] = () -> System.out.println("Syrup: Shake well before use");
	                    break;
	                case 3:
	                    medicines[i] = () -> System.out.println("Ointment: For external use only");
	                    break;
	            }

	            // Check the polymorphic behavior of the displayLabel() method
	            System.out.print("Medicine at index " + i + ": ");
	            medicines[i].displayLabel();
	        }
	}

}
