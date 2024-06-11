/**
 * WhatIfElse class controls the flow of execution of a program based on certain conditions.
 * <p>
 * The if statement alone tells us that if a condition is true it will execute a block of statements
 * and if the condition is false it won't. But what if user wants to do something else if the condition is
 * false? Here comes the else statement. User can use the else statement with the if statement to
 * execute a block of code when the condition is false. 
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #WhatIfElse
 */
public class WhatIfElse {
    
    /**
     * Class constructor.
     */
    public WhatIfElse() {

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

        int number = -10;

        if(number >= 0)
            System.out.println(number + " is an absolute integer.");
        else
            System.out.println(number + " is not an absolute integer.");
    }
}