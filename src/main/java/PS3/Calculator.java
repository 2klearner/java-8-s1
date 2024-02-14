package PS3;

public class Calculator {

	  public static void calculate(int a, int b, IntegerMath operation) {
	        int result = operation.operation(a, b);
	        System.out.println("Result: " + result);
	    }
}
