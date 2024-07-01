import java.util.Scanner;

/**
 * WhatNestedIf class tells user how to control the nested if blocks.
 * <p>
 * A nested if is an if statement that is the target of another if or else.
 * Nested if statements mean an if statement inside an if statement.
 * Yes, java allows user to nest if statements within if statements.
 * User can place an if statement inside another if statement.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #WhatNestedIf
 */
public class WhatNestedIf {
    
    /**
     * Class constructor.
     */
    public WhatNestedIf() {

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

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int number = sc.nextInt();

        if(number >= 0) {
            if(number == 7)
                System.out.println("This is Christiano Ronaldo!");
            else
                System.out.println("This is another player.");
        } else {
            System.out.println("Negative number!!!");
        }

        sc.close();
    }
}