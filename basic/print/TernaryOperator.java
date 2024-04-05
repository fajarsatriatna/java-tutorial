/**
 * Perform ternary operator in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class TernaryOperator {
    
    /**
     * This TernaryOperator() method is a no-args constructor.
     */
    public TernaryOperator() {

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

        int a = 5;
        int b = 7;

        /**
         * Ternary operator is a shorthand version of the if-else statement.
         * It has three operands and hence the name ternary.
         */
        System.out.println("a is smaller that b? " + (a < b? true : false));
    }
}