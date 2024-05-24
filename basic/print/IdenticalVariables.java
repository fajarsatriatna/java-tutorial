/**
 * IdenticalVariables class helps user recognize identical variables in different scopes.
 * <p>
 * User identifies two different variables in different scopes.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #IdenticalVariables
 */
public class IdenticalVariables {
    
    /**
	 * Class constructor.
	 */
    public IdenticalVariables() {

    }
    
    /**
     * Class variable.
     */
    private int age;
    
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
         * Local variable.
         */
        int age = 10;
        
        /**
         * Instantiates object to call class variable.
         */
        IdenticalVariables obj = new IdenticalVariables();

        System.out.println(age);
        System.out.println(obj.age);
    }
}