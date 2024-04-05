/**
 * Perform arithmetic operators in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class Arithmetic {

    /**
     * This Arithmetic() method is a no-args constructor.
     */
    public Arithmetic() {

    }

    /**
	 * Set <code>main()</code> method to the class.
	 * 
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param args	A command-line argument array to retrieve input from the console.
	 */
    public static void main(String[] args) {

        /**
         * This a variable is the first variable.
         */
        int a = 10;

        /**
         * This b variable is the second variable.
         */
        int b = 4;

        System.out.println("a + b is " + (a + b));
        System.out.println("a - b is " + (a - b));
        System.out.println("a * b is " + (a * b));
        System.out.println("a / b is " + (a / b));
        System.out.println("a % b is " + (a % b));
    }
}