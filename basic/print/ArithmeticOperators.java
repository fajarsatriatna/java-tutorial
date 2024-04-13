/**
 * ArithmeticOperators class shows how to use these kind of operators.
 * <p>
 * These operators involve the mathematical operators that can be used to perform
 * various simple or advanced arithmetic operations
 * on the primitive data types referred to as the operands.
 * These operators consist of various unary and binary operators
 * that can be applied on a single or two operands.
 * <p>
 * Let's look at the various operators that Java has to provide under the arithmetic operators:
 * <ul>
 * <li>Addition (+): Addition of two numbers</li>
 * <li>Subtraction (-): Subtraction of two numbers</li>
 * <li>Multiplication (*): Multiplication of two numbers</li>
 * <li>Division (/): Division of two numbers</li>
 * <li>Modulus (%): Modulus operator divides two numbers and returns the remainder</li>
 * </ul>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #ArithmeticOperators
 */
public class ArithmeticOperators {

    /**
     * Class constructor.
     */
    public ArithmeticOperators() {

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
        int b = 4;

        System.out.println("a + b is " + (a + b));
        System.out.println("a - b is " + (a - b));
        System.out.println("a * b is " + (a * b));
        System.out.println("a / b is " + (a / b));
        System.out.println("a % b is " + (a % b));
    }
}