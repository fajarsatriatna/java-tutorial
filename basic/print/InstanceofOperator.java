/**
 * Perform instanceof operators in Java.
 * 
 * @author Fajar Satriatna
 * @see Human
 * @see Man
 * @see Woman
 * @see Period
 * @since 0.1.0
 */
public class InstanceofOperator {
    
    /**
     * This InstanceofOperator() method is a no-args constructor.
     */
    public InstanceofOperator() {

    }
    
    /**
	 * Set <code>main()</code> method to the class.
	 * 
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param args	A command-line argument array to retrieve input from the console.
	 */
    public static void main(String[] args) {

        Human timotee = new Man();
        Human kylie = new Woman();

        System.out.println("is timotee instance of man? " + (timotee instanceof Man));
        System.out.println("is kylie instance of man? " + (kylie instanceof Man));
        System.out.println("is kylie instance of woman? " + (kylie instanceof Woman));
        System.out.println("is kylie instance of period? " + (kylie instanceof Period));
    }
}

/**
 * This is parent class for Man and Woman class.
 */
class Human {

}

/**
 * This is subclass derived from human class.
 */
class Man extends Human {

}

/**
 * This is subclass derived from human class.
 * It also implements period interface.
 */
class Woman extends Human implements Period{

}


/**
 * This is interface which is implemented by woman class.
 */
interface Period {

}