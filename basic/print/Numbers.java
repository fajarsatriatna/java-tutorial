/**
 * Numbers class defines how to declare multiple variables.
 * <p>
 * User can use a comma-separated list to declare more than one variable of the same type.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Numbers
 */
public class Numbers {

    /**
     * Class constructor.
     */
    public Numbers() {

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

        int a = 1, b = 2, c = 3;

        System.out.println(a + " " + b + " " + c);

        int d, e, f;
        d = e = f = 10;

        System.out.println(d + " " + e + " " + f);
    }    
}