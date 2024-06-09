import java.util.*;

/**
 * HasNext class helps user identify the use of this method.
 * <p>
 * The Scanner class is a handy tool that can parse primitive types and strings
 * using regular expressions and was introduced into the java.util package in Java 5.
 * The hasNext() method checks if the Scanner has another token in its input.
 * A Scanner breaks its input into tokens using a delimiter pattern, which matches whitespace by default.
 * That is, hasNext() checks the input and returns true if it has another non-whitespace character.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #HasNext
 */
public class HasNext {
    
    /**
     * Class constructor.
     */
    public HasNext() {
        
    }
    
    /**
	 * Executes Java program.
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param   args        Array-typed argument to retrieve input from the console.
	 */
    public static void main(String[] args) {

        String str = "1 2 3 4 5 hello";

        Scanner sc = new Scanner(str);

        /**
         * This method returns true if input has tokens.
         */
        while(sc.hasNext()) {

            /**
             * This method returns true if token is integer.
             */
            System.out.println(sc.hasNextInt());

            /**
             * This method gets the current value.
             */
            System.out.println(sc.next());
        }

        /**
         * This attempts to close the connection.
         */
        sc.close();
    }
}