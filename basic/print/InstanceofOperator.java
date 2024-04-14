/**
 * InstanceofOperator class performs instanceof operator in Java.
 * <p>
 * In Java, instanceof is a keyword used for checking if a reference variable
 * contains a given type of object reference or not.
 * Following is a Java program to show different behaviors of instanceof.
 * Henceforth it is known as a comparison operator where the instance is getting compared
 * to type returning boolean true or false as in Java we do not have 0 and 1 boolean return types.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #InstanceofOperator
 * @see         Human
 * @see         Man
 * @see         Woman
 * @see         Woman
 * @see         Period
 */
public class InstanceofOperator {
    
    /**
     * Class constructor.
     */
    public InstanceofOperator() {

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

        Human timotee = new Man();
        Human kylie = new Woman();

        System.out.println("is timotee instance of man? " + (timotee instanceof Man));
        System.out.println("is kylie instance of man? " + (kylie instanceof Man));
        System.out.println("is kylie instance of woman? " + (kylie instanceof Woman));
        System.out.println("is kylie instance of period? " + (kylie instanceof Period));
    }
}

/**
 * Human class is designed to create human object.
 */
class Human {

}

/**
 * Man class is designed to create man object.
 * This is a subclass derived from Human class.
 */
class Man extends Human {

}

/**
 * Woman class is designed to create woman object.
 * This is a subclass derived from Human class.
 * This implements Period interface.
 */
class Woman extends Human implements Period{

}

/**
 * Period interface is designed to implement abstract method.
 */
interface Period {

}