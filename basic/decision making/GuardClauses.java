/**
 * GuardClauses class refactors nested-if statements
 * <p>
 * Guard clauses are conditional statements that exit a function early
 * if certain conditions are met, helping user avoid deep nesting
 * and making code more readable and maintainable.
 * <p>
 * Nested if statements can quickly become unwieldy, leading to what is commonly
 * referred to as "arrow code" due to the shape it forms in your editor.
 * This pattern makes it hard to follow the logic and understand the conditions being checked.
 * It's also easy to introduce errors when modifying deeply nested code.
 * <p>
 * Guard clauses provide an early exit from a function if a condition is not met,
 * allowing the main logic of the function to be less indented and more straightforward.
 * They are particularly useful for checking preconditions, such as input validation or state verification.
 * <p>
 * Benefits of Using Guard Clauses:
 * <ol>
 * <li><b>Improved Readability</b>: Code is more linear and easier to follow, as the main path of
 * execution is not deeply nested.</li>
 * <li><b>Easier Maintenance</b>: With less complexity, it's easier to modify or extend the code
 * without introducing bugs.</li>
 * <li><b>Error Handling and Input Validation</b>: Guard clauses make it straightforward to handle errors
 * and validate inputs at the start of a function, keeping the main logic clean and focused.</li>
 * </ol>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #GuardClauses
 */
public class GuardClauses {
    
    /**
     * Class constructor.
     */
    public GuardClauses() {

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

        String name = "Fajar Satriatna";
        byte age = 26;

        /**
         * In this refactored example, the guard clauses check for the conditions that would prevent
         * the function from continuing its main logic. If any of these conditions are met,
         * the function returns early. This approach reduces the nesting depth and makes the code easier
         * to read and understand.
         */
        if(!name.equals("Fajar Satriatna")) {
            System.out.println("This is not Fajar Satriatna.");
            return;
        }

        if(age != 26) {
            System.out.println("Maybe this is another Fajar Satriatna.");
            return;
        } 

        System.out.println ("This is Fajar Satriatna.");
    }
}