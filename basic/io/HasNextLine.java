import java.util.*;

/**
 * HasNextLine explains how this method performs operation.
 * <p>
 * This method checks to see if there's another line in the input of the Scanner object
 * no matter if the line is blank or not.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #HasNextLine
 */
public class HasNextLine {
    
    /**
     * Class constructor.
     */
    public HasNextLine() {

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

        /**
         * If user wants to separate tokens, use \n (new line).
         * Or else, it will be considered as a whole string.
         */
        String str = new StringBuilder()
        .append("\tarsenal\n")
        .append("     barcelona         \n")
        .append("\t\t\tchelsea ")
        .append("leverkusen       ")
        .toString();

        Scanner sc = new Scanner(str);

        int line = 0;

        while(sc.hasNextLine())
            System.out.println(String.format("%d | %s", ++line, sc.nextLine()));

        sc.close();
    }
}