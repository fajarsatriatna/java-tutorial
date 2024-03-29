/**
 * Print default value of data type into the console.
 * 
 * <p>
 * It shows how each data type variable has its own default value.
 * 
 * @author Fajar Satriatna
 * @since 0.1.0
 */
public class DefaultValue {
    
    /*
    There would have been a problem if variable bonus was not a class member 
    as the compiler never assigns default values to an uninitialized local variable.
    It causes an error when a local variable variable has never been initialized.
    For example:
    int bonus;System.out.println("My Bonus is " + bonus);
    */

   /**
    * This DefaultValue() method is a no-args constructor.
    */
   public DefaultValue(){

   }

    /**
     * This age variable has default value: 0.
     */
    public static byte age;
    
    /**
     * This employeeNumber variable has default value: 0.
     */
    public static short employeeNumber;

    /**
     * This outcomePerMonth variable has default value: 0.
     */
    public static int outcomePerMonth;

    /**
     * This salaryPerMonth variable has default value: 0.
     */
    public static long salaryPerMonth;

    /**
     * This moneyOnPayPal variable has default value: 0.0.
     */
    public static float moneyOnPayPal;

    /**
     * This savings variable has default value: 0.0.
     */
    public static double savings;

    /**
     * This driverLicense variable has default value: ''.
     */
    public static char driverLicense;

    /**
     * This isMale variable has default value: false.
     */
    public static boolean isMale;

    /**
     * This address variable has default value: null.
     */
    public static String address;
    
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