/**
 * TernaryOperator class shows how to use this operator properly.
 * <p>
 * Ternary operator is the only conditional operator that takes three operands.
 * It is a one-liner replacement for the if-then-else statement and is used a lot in Java programming.
 * User can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators.
 * Although it follows the same algorithm as of if-else statement
 * the conditional operator takes less space and helps to write the if-else statements in the shortest way possible.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #TernaryOperator
 */
public class TernaryOperator {
    
    /**
     * Class constructor.
     */
    public TernaryOperator() {

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

        int a = 5;
        int b = 7;

        /**
         * Ternary operator is a shorthand version of the if-else statement.
         * It has three operands and hence the name ternary.
         */
        System.out.println("a is smaller that b? " + (a < b? true : false));
    }
}