/**
 * AssignmentOperators class shows how to use these kind of operators.
 * <p>
 * Compound statement is a statement to make operation become shorter.
 * There are assignment operators including:
 * <ul>
 * <li>-= operator is used to subtract value. it is the same as a = a - 3</li>
 * <li>*= operator is used to multiply value. it is the same as a = a * 4</li>
 * <li>/= operator is used to divide value. it is the same as a = a / 2</li>
 * <li>%= operator is used to assign module to find the remainder when one integer is divided by another.
 * It is the same as a = a % 2</li>
 * </ul>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #AssignmentOperators
 */
public class AssignmentOperators {
    
    /**
     * Class constructor.
     */
    public AssignmentOperators() {
        
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
        
        /**
         *Assignment operator (=) is used to assign value to a variable.
         */
        int a = 5;
        System.out.println("a is " + a);

        a += 10;
        System.out.println("a =+ 10 is " + a);

        a -= 3;
        System.out.println("a -= 3 is " + a);

        a *= 4;
        System.out.println("a *= 4 is " + a);

        a /= 2;
        System.out.println("a /= 2 is " + a);

        a %= 2;
        System.out.println("a %= 2 is " + a);
    }
}