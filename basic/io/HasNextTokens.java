import java.util.*;

/**
 * HasNextTokens explains how delimiter separates tokens.
 * <p>
 * The Scanner class provides a useDelimiter(String pattern) method
 * that allows us to change the delimiter.
 * Once the delimiter is changed, the hasNext() method will check with the new delimiter
 * instead of the default one.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #HasNextTokens
 */
public class HasNextTokens {
    
    /**
     * Class constructor.
     */
    public HasNextTokens() {
        
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

        String str = new StringBuilder()
        .append("arsenal:\tchelsea:\nliverpool:")
        .append("\nbayern:\n\n\n\ninter:\t         ")
        .append("         benfica:milan:leverkusen\t\tbarca:")
        .append("madrid\t\t\t\tmu\n\t\t")
        .toString();

        Scanner sc = new Scanner(str);

        int line = 0;

        while(sc.hasNext()) {
            String val = sc.next();

            /**
             * After the scanner parses a token matching the string inter:, user will change the delimiter
             * to a colon (:) so that user can parse and extract each value of the inter:.
             * The ":|\\s+" is a regular expression matching a single ":" or one or more whitespace characters.
             */
            if ("inter:".equals(val))
                sc.useDelimiter(":|\\s+");

            System.out.println(String.format("%d | %s", ++line, val));
        }
        sc.close();
    }
}