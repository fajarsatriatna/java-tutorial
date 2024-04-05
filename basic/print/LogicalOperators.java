/**
 * Perform logical operators in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class LogicalOperators {
    
    /**
     * This LogicalOperators() method is a no-args constructor.
     */
    public LogicalOperators() {

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

        boolean a = true;
        boolean b = false;

        /**
         * && operator is the same as and (all condition must be true to return true)
         * || operator is the same as or (one condition which has true condition can return true)
         * ! operator is the same as not (invert a boolean)
         */
        System.out.println("a and b is " + (a && b));
        System.out.println("a or b is " + (a || b));
        System.out.println("!a is " + !a);
    }
}