/**
 * Comments class generates single-line comment and multi-line comments in Java.
 * <p>
 * User can use 3 types of comments including:
 * <ul>
 * <li>Single-Line Comment</li>
 * <li>Multi-Line Comment</li>
 * <li>JavaDoc Comment</li>
 * </ul>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Comments
 */
public class Comments {

    /**
     * Class constructor.
     */
    public Comments() {

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
        
        // This is a single-line comment.
        System.out.println("Hello i am alive!");
        
        System.out.println("Au revoir!"); // Hey, this is also a single-line comment, you can put it upside or beside of your line of code.
        
        /*
        This line of code allows you to display value in console.
        I hope you like it!
        */
        System.out.println("Hey there, i am here!"); 

        /**
         * Local variable within <code>main</code> block.
         */
        int name = "Fajar Satriatna";

        System.out.println("My name is " + name);
    }
}