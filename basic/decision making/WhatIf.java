/**
 * WhatIf class controls the flow of execution of a program based on certain conditions.
 * <p>
 * If statement is the most simple decision-making statement.
 * It is used to decide whether a certain statement or block of statements will be executed or not
 * i.e if a certain condition is true then a block of statements is executed otherwise not.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #WhatIf
 */
public class WhatIf {
    
    /**
     * Class constructor.
     */
    public WhatIf() {
        
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

        String carName = "Renault";

        /**
         * If user does not provide the curly braces after 'if' then by default
         * the if statement itself will consider the immediate one statement to be inside its block. 
         */
        if(carName.equals("Renault"))
            System.out.println("I am inside of this car right now!");
            System.out.println("Oops! It is outside of if block.");
    }
}