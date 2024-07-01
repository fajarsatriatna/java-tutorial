import java.util.Scanner;

/**
 * WhatIfElseLadder class tells user how to control a few of if-else blocks.
 * <p>
 * User can decide among multiple options. The if statements are executed from the top down.
 * As soon as one of the conditions controlling the if is true, the statement associated with
 * that 'if' is executed, and the rest of the ladder is bypassed.
 * If none of the conditions is true, then the final else statement will be executed.
 * There can be as many as 'else if' blocks associated with one 'if' block but only one 'else' block
 * is allowed with one 'if' block.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #WhatIfElseLadder
 */
public class WhatIfElseLadder {
    
    /**
     * Class constructor.
     */
    public WhatIfElseLadder() {

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

        System.out.print("insert a number: ");
        int num = sc.nextInt();

        if(num == 1)
            System.out.println("i am the one");
        else if(num == 2)
            System.out.println("i am the second");
        else if(num == 3)
            System.out.println("i am the third");
        else
            System.out.println("i am other");
    }
}