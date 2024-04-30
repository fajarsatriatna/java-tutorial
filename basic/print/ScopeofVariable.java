/**
 * ScopeofVariable class defines the area of variable whose scope is accessible.
 * <p>
 * Scope of a variable is the part of the program where the variable is accessible.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #ScopeofVariable
 */
public class ScopeofVariable {

    /**
     * Class constructor.
     */
    public ScopeofVariable() {

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
        
        /*
        1.  This is scope of variable a.
            for(int a = 0; a < 10; ++a)
                System.out.println(a);

        2.  When user tries to initialize new variable named a, inner loop will terminate
            before the outer loop variable is declared. The inner loop variable is destroyed first
            and then the new variable of same name has been created.
            int a = 20;

        3.  The final result of variable a is 20.
            System.out.println(a);
        */
        
        /*
        1.  Variable b is first initialized.
            int b = 10;
        
        2.  New variable with the same name is declared and initialized inside of block label.
            block:{
                int b = 20;
                System.out.println(b);
            }
        
        3.  Throwing error at the end of execution.
            System.out.println(b);
        */
        
        /*
        1.  Variable c is first declared and initialized.
            int c = 1;

        2.  Another variable named c is then initialized, causes an error.
            for (int c = 1; c <= 20; ++c)
                System.out.println(c);
        */
        
        /*
        1.  At first, for-loop statement is set. Variable named d is initialized afterwards.
            for (int d = 1; d <= 10; ++d)
                System.out.println(d);

        2.  Call variable d.
            System.out.println(d);
        */
    }
}