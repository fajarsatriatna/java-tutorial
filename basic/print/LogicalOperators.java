/**
 * LogicalOperators class performs logical operators in Java.
 * <p>
 * Logical operators are used to perform logical and, or, and not operation.
 * They are used to combine two or more conditions/constraints or to complement
 * the evaluation of the original condition under particular consideration.
 * <p>
 * One thing to keep in mind that:
 * <ul>
 * <li> AND Operator (&amp;&amp;): This returns true when both the conditions under consideration are satisfied or are true.</li>
 * <li> OR Operator (||): This returns true when one of the two conditions under consideration is satisfied or is true.</li>
 * <li> NOT Operator (!): This returns true when the condition under consideration is not satisfied or is a false condition.</li>
 * </ul>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #LogicalOperators
 */
public class LogicalOperators {
    
    /**
     * Class constructor.
     */
    public LogicalOperators() {

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

        boolean a = true, b = false;

        System.out.println("a and b is " + (a && b));
        System.out.println("a or b is " + (a || b));
        System.out.println("!a is " + !a);
    }
}