/**
 * Perform unary operators in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class UnaryOperators {
    
    /**
     * This UnaryOperators() method is a no-args constructor.
     */
    public UnaryOperators() {

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
         * Unary operators for number: +, ++, -, and --.
         * 
         * Example:
         * 
         * (+)10 and -20.
         */
        int a = 10;
        int b = -20;

        System.out.println("a + b is " + (a + b));

        int c = 5;
        int d = 7;
        
        /**
         * Post-Increment: value is first used for computing the result, then incremented.
         * Pre-Decrement: value is first incremented, then the result is computed.
         * 
         * (c++) -> c = 5 -> printed: 5, computed: 6.
         * (++c) -> c = 6 -> printed: 7, computed: 7.
         * 
         * (d--) -> d = 7 -> printed: 7, computed: 6.
         * (--d) -> d = 6 -> printed: 5, computed: 5.
         */
        System.out.println("c++ is " + c++);
        System.out.println("++c is " + ++c);
        System.out.println("d-- is " + d--);
        System.out.println("--d is " + --d);
        
        /**
         * Logical ! (not) operator is for inverting a boolean value.
         * 
         * Example:
         * 
         * !true = false and !false = true.
         */
        System.out.println("!true is " + !true);
        System.out.println("!false is " + !false);
    }
}