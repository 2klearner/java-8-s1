package PS3;

public class TestCalculator {
	
	public static void main(String [] args) {
		Calculator.calculate(5, 3, (a, b) -> {
            System.out.println("Performing addition operation");
            return a + b;
        });

        // Subtraction
        Calculator.calculate(8, 4, (a, b) -> {
            System.out.println("Performing subtraction operation");
            return a - b;
        });

        // Multiplication
        Calculator.calculate(6, 7, (a, b) -> {
            System.out.println("Performing multiplication operation");
            return a * b;
        });

        // Division
        Calculator.calculate(10, 2, (a, b) -> {
            System.out.println("Performing division operation");
            return a / b;
        });
	}

}
