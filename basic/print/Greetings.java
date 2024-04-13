/**
 * Greetings class helps user recognize the use of print() and println().
 * <p>
 * User can add as many print() or println() methods as user wants.
 * It helps user display value in console.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Greetings
 */
public class Greetings {
	
	/**
	 * Class constructor.
	 */
	public Greetings(){

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
		 * This println() method is used to display value by creating new line of code.
		 */
		System.out.println("Hello World!");
		System.out.println("My name is Fajar!");
		
		/**
		 * This print() method is also used to display value from left to right
		 * without adding new line of code.
		 */
		System.out.print("This is ");
		System.out.print("how print() works!");
    }
}