import java.util.Scanner;

/**
 * WhatSwitch class selects one of many code blocks to be executed.
 * <p>
 * The switch statement is a multiway branch statement.
 * It provides an easy way to dispatch execution to different parts of code based on
 * the value of the expression. Instead of writing many if-else statements, user can use
 * the switch statement. The switch statement selects one of many code blocks to be executed.
 * <p>
 * This is how it works:
 * <ul>
 * <li>The switch expression is evaluated once.</li>
 * <li>The value of the expression is compared with the values of each case.</li>
 * <li>If there is a match, the associated block of code is executed.</li>
 * <li>The break and default keywords are optional.</li>
 * </ul>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #WhatSwitch
 */
public class WhatSwitch {
    
    /**
     * Class constructor.
     */
    public WhatSwitch() {

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
        int number = sc.nextInt();

        String day;

        /**
         * When Java reaches a break keyword, it breaks out of the switch block.
         * This will stop the execution of more code and case testing inside the block.
         * When a match is found, and the job is done, it is time for a break.
         * There is no need for more testing.
         * 
         * The default keyword specifies some code to run if there is no case match.
         * Note that if the default statement is used as the last statement in a switch block
         * it does not need a break.
         */
        switch(number) {
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wednesday";
                break;
            case 4:
                day = "Ttursday";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "saturday";
                break;
            case 7:
                day = "sunday";
                break;
            default:
                day = "Out of day";
        }

        System.out.println(day);

        sc.close();
    }
}