/**
 * AssignVariable class describes how assignment operator works in Java.
 * <p>
 * This operator is used to assign value to a variable.
 * The left side operand of the assignment operator is a variable
 * and the right side operand of the assignment operator is a value.
 * The value on the right side must be of the same data type of the operand on the left side.
 * Otherwise, the compiler will raise an error.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #AssignVariable
 */
public class AssignVariable {
    
    /**
     * Class constructor.
     */
    public AssignVariable() {

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
         * This carName is assigned to store value from right-handed side.
         */
        String carName = "lamborghini";

        /**
         * This horsePower can be initialized first then assigned.
         */
        int horsePower;
        horsePower = 45_000;

        /**
         * A new value can be assign to this existing variable.
         */
        double price = 50_000.45;
        price = 66_000.234;

        System.out.println("this is " + carName);
        System.out.println("it has " + horsePower + " horse power");
        System.out.println("it costs " + price + " usd");

        /**
         * If you have a non-changeable variable, you can add final modifier.
         * Once you assign final modifier to a variable, the value can't be changed.
         */
        final String carColor = "yellow";

        System.out.println("this car has " + carColor + " color");
    }
}