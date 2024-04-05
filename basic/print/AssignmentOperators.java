/**
 * Perform assignment operators in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class AssignmentOperators {
    
    /**
     * This AssignmentOperators() method is a no-args constructor.
     */
    public AssignmentOperators() {
        
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
         * = operator is used to assign value to variable.
         */
        int a = 5;

        System.out.println("a is " + a);

        /**
         * Compound statement is a statement to make operation become shorter.
         * 
         * += operator is used to add value. it is the same as a = a + 10.
         * -= operator is used to subtract value. it is the same as a = a - 3.
         * *= operator is used to multiply value. it is the same as a = a * 4.
         * /= operator is used to divide value. it is the same as a = a / 2.
         * %= operator is used to assign module to find the remainder when one integer is divided by another. it is the same as a = a % 2.
         */
        a += 10;
        System.out.println("a =+ 10 is " + a);

        a -= 3;
        System.out.println("a -= 3 is " + a);

        a *= 4;
        System.out.println("a *= 4 is " + a);

        a /= 2;
        System.out.println("a /= 2 is " + a);

        a %= 2;
        System.out.println("a %= 2 is " + a);
    }
}