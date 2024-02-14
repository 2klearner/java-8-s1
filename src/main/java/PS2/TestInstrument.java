package PS2;

public class TestInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Instrument[] instruments = new Instrument[10];

        // Assign different types of instruments to Instrument references using Lambda Expressions
        instruments[0] = () -> System.out.println("Piano is playing tan tan tan tan");
        instruments[1] = () -> System.out.println("Flute is playing toot toot toot toot");
        instruments[2] = () -> System.out.println("Guitar is playing tin tin tin");

        // Assign more instruments...
        // instruments[3] = () -> ... // Another instrument
        // ...

        // Check for polymorphic behavior of play method
        for (int i = 0; i < instruments.length; i++) {
            System.out.print("Instrument at index " + i + ": ");
            instruments[i].play();

            // Use instanceof to print the type of object stored at each index
            if (instruments[i] instanceof Piano) {
                System.out.println("Type: Piano");
            } else if (instruments[i] instanceof Flute) {
                System.out.println("Type: Flute");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println("Type: Guitar");
            } else {
                System.out.println("Type: Unknown");
            }
        }

	}

}
