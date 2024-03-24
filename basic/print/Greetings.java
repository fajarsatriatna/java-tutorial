/**
 * Print value of String data type into the console.
 * 
 * <p>
 * You can add as many print() or println() methods as you want.
 * It helps you to display value in console.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class Greetings {

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
		 * This println() method is used to display value by creating new line of code.
		 */
		System.out.println("Hello World!");
		System.out.println("My name is Fajar!");
		
		/**
		 * This print() method is also used to display value from left to right without adding new line of code.
		 */
		System.out.print("This is ");
		System.out.print("how print() works!");
    }
}