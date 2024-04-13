/**
 * UnaryOperators class describes what unary operators is in Java.
 * <p>
 * Java unary operators are the types that need only one operand to perform any operation like increment, decrement, negation, etc.
 * It consists of various arithmetic, logical and other operators that operate on a single operand.
 * <p>
 * Unary operators consist of +, ++, -, --, ~ (bitwise complement), and !.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #UnaryOperators
 */
public class UnaryOperators {
    
    /**
     * Class constructor.
     */
    public UnaryOperators() {

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
        int b = -20;

        System.out.println("a + b is " + (a + b));

        /**
         * You can convert positive to negative number.
         */
        a = -a;

        System.out.println("a is converted to minus becoming " + a);

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
         * Bitwise complement operator (~) returns the one's complement representation of the input value or operand
         */
        int e = 5;
        e = ~e;

        System.out.println("bitwise complement of 5 is " + e);
        
        /**
         * Logical not (!) operator is used to convert true to false or vice versa.
         */
        System.out.println("!true is " + !true);
        System.out.println("!false is " + !false);
    }
}