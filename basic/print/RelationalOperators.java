/**
 * Perform relational operators in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class RelationalOperators {
    
    /**
     * This RelationalOperators() method is a no-args constructor.
     */
    public RelationalOperators() {

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

        int a = 10;
        int b = 12;

        /**
         * Relational operators return boolean after comparison.
         */
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));
        System.out.println("a == b is " + (a == b));
        System.out.println("a != b is " + (a != b));
    }
}