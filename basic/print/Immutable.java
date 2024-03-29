/**
 * Show how primitive data types are immutable.
 * 
 * <p>
 * Primitive data types are immutable, meaning their values cannot be changed once assigned.
 * When you modify a variable of a primitive type, you are creating a new value.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class Immutable {

	/**
     * This Immutable() method is a no-args constructor.
     */
    public Immutable() {

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

        int salary = 5_000_000;

        System.out.println("My salary is " + salary);

        /**
         * This salary variable is assigned to bonus variable and won't get any changes.
         * It is still 5.000.000 while bonus variable has 15.000.000.
         */
        int bonus = salary;
        bonus += 10_000_000;

        System.out.println("My bonus is " + bonus);
        System.out.println("My salary after get changed is " + salary);
    }
}