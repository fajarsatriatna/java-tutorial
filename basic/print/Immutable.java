/**
 * Immutable class shows how primitive data types are immutable.
 * <p>
 * Primitive data types are immutable, meaning their values cannot be changed once assigned.
 * When you modify a variable of a primitive type, you are creating a new value.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Immutable
 */
public class Immutable {

	/**
     * Class constructor.
     */
    public Immutable() {

    }
    
    /**
	 * Executes Java program.
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param args  Array-typed argument to retrieve input from the console.
	 */
    public static void main(String[] args) {

        /**
         * This salary variable is given 5.000.000.
         */
        int salary = 5_000_000;

        System.out.println("My salary is " + salary);

        /**
         * This salary variable is assigned to this bonus variable.
         * At this point, this bonus variable adds 10.000.000 to itself and becomes 15.000.000.
         * Meanwhile, this salary variable remains 5.000.000.
         */
        int bonus = salary;
        bonus += 10_000_000;

        System.out.println("My bonus is " + bonus);
        System.out.println("My salary after get changed is " + salary);
    }
}