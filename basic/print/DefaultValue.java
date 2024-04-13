/**
 * DefaultValue class describes what default value of data types is.
 * <p>
 * When a variable is declared but not initialized, it is assigned a default valuebased on its data type.
 * The default values for the primitive data types in Java are as follows:
 * <ul>
 * <li>byte: 0</li>
 * <li>short: 0</li>
 * <li>int: 0</li>
 * <li>long: 0L</li>
 * <li>float: 0.0f</li>
 * <li>double: 0.0d</li>
 * <li>char: '\u0000' (null character)</li>
 * <li>boolean: false</li>
 * </ul>
 * <p>
 * It is important to note that these default values are only assigned
 * if the variable is not explicitly initialized with a value.
 * If a variable is initialized with a value, that value will be used instead of the default.
 * <p>
 * There would have been a problem if age and others are not class variables
 * as the compiler never assigns default values to uninitialized local variables
 * and it causes an error when local variables have never been initialized.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #DefaultValue
 * @see         #age
 * @see         #employeeNumber
 * @see         #outcomePerMonth
 * @see         #salaryPerMonth
 * @see         #moneyOnPayPal
 * @see         #savings
 * @see         #driverLicense
 * @see         #isMale
 * @see         #address
 */
public class DefaultValue {

   /**
    * Class constructor.
    */
   public DefaultValue(){

   }

    /**
     * Age of an employee.
     */
    public static byte age;
    
    /**
     * Unique employee number.
     */
    public static short employeeNumber;

    /**
     * Outcome per month which an employee earns.
     */
    public static int outcomePerMonth;

    /**
     * Salary per month which an employee earns.
     */
    public static long salaryPerMonth;

    /**
     * Amount of money spent on PayPal.
     */
    public static float moneyOnPayPal;

    /**
     * Amount of money spent in a bank.
     */
    public static double savings;

    /**
     * Driver License of an employee.
     */
    public static char driverLicense;

    /**
     * Gender of an employee.
     */
    public static boolean isMale;

    /**
     * Address of an employee.
     */
    public static String address;

	/**
	 * Executes Java program.
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param args  Array-typed argument to retrieve input from the console.
	 */
    public static void main(String[] args) {
        
        System.out.println("My age is " + age);
        System.out.println("My employee number is " + employeeNumber);
        System.out.println("My outcome per month is " + outcomePerMonth);
        System.out.println("My salary per month is " + salaryPerMonth);
        System.out.println("My money on paypal is " + moneyOnPayPal);
        System.out.println("My savings is " + savings);
        System.out.println("My driver license is " + driverLicense);
        System.out.println("My gender is " + isMale);
        System.out.println("My address is " + address);
    }
}