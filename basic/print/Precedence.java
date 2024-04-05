/**
 * Show precedence operators in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class Precedence {
    
    /**
     * This Precedence() method is a no-args constructor.
     */
    public Precedence() {

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

        int a = 3;
        int b = 18;
        int c = 9;

        /**
         * / operator has higher precedence than +.
         */
        System.out.println("a + b / c is " + (a + b / c));

        int d = 5;
        int e = 8;

        /**
         * ++ operator has higher precedence than +.
         */
        System.out.println("d++ + e is " + (d++ + e));

        int f = 10;
        int g = 5;

        /**
         * Take note that prefer using + over ().
         * When using the + operator inside <code>System.out.println()</code> make sure to do addition using parenthesis.
         * If we write something before doing addition, then string addition takes place, that is, associativity of addition-
         * is left to right, and hence integers are added to a string first producing a string, and string objects-
         * concatenate when using +.
         * Therefore it can create unwanted results.
         */
        System.out.println("f + g is " + f + g);
        System.out.println("f + g is " + (f + g));
    }
}