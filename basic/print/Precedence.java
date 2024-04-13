/**
 * Precedence class shows how operator precedence works in Java.
 * <p>
 * Operator precedence determines the order in which the operators in an expression are evaluated.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Precedence
 */
public class Precedence {
    
    /**
     * Class constructor.
     */
    public Precedence() {

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

        int a = 3;
        int b = 18;
        int c = 9;

        /**
         * Multiplicative operators (/,*, and %) have higher precedence than +.
         */
        System.out.println("a + b / c is " + (a + b / c));

        int d = 5;
        int e = 8;

        /**
         * Postfix increment and decrement operators (++ and --) have higher precedence than +.
         */
        System.out.println("d++ + e is " + (d++ + e));

        int f = 10;
        int g = 5;

        /**
         * Take note that prefer using + over ().
         * <p>
         * When using the + operator inside <code>System.out.println()</code> make sure to do addition using parenthesis.
         * If user writes something before doing addition, then string addition takes place, that is, associativity of addition
         * is left to right, and hence integers are added to a string first producing a string, and string objects
         * concatenate when using +.
         * Therefore it can create unwanted results.
         */
        System.out.println("f + g is " + f + g);
        System.out.println("f + g is " + (f + g));
    }
}