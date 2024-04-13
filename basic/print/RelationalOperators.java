/**
 * RelationalOperators class helps user check relations between two operands.
 * <p>
 * Relational operators are a bunch of binary operators used to check for relations between two operands
 * including equality, greater than, less than, etc.
 * They return a boolean result after the comparison and are extensively used in
 * looping statements as well as conditional if-else statements and so on.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #RelationalOperators
 */
public class RelationalOperators {

    /**
     * Class constructor.
     */
    public RelationalOperators() {

    }
    
    /**
	 * Executes Java program.
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param args	Array-typed argument to retrieve input from the console.
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