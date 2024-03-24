/**
 * Generate a single-line and multi-line comment in Java.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class Comments {
    
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
         * This is an example of single-line comment.
         */
        // This is a single-line comment.
        System.out.println("Hello i am alive!");
        
        /**
         * You can put the comment beside the code.
         */
        System.out.println("Au revoir!"); // Hey, this is also a single-line comment, you can put it upside or beside of your line of code.
        
        /**
         * This is an example of multi-line comment.
         */
        /*
        This line of code allows you to display value in console.
        I hope you like it!
        */
        System.out.println("Hey there, i am here!"); 
    }
}