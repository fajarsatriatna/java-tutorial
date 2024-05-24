import java.util.ArrayList;

/**
 * Wrapper class helps you understand why we should wrap primitive data type to object.
 * <p>
 * A wrapper class in Java is a class whose object wraps or contains primitive data types.
 * When user creates an object to a wrapper class, it contains a field and in this field
 * user can store primitive data types.
 * In other words, user can wrap a primitive value into a wrapper class object.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Wrapper
 */
public class Wrapper {

    /**
     * Class constructor.
     */
    public Wrapper() {

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
         * This process is called autoboxing.
         * This converts primitive data type to object.
         */
        char ch1 = 'a';
        Character ch2 = ch1;
        System.out.println(ch2);

        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(20);
        System.out.println(ls.get(0));

        /**
         * This process is called unboxing.
         * This converts an object to primitive data type.
         */
        Long l1 = 10000000L;
        long l2 = l1;
        System.out.println(l2);

        ArrayList<Integer> ls2 = new ArrayList<Integer>();
        ls2.add(50);
        int int1 = ls2.get(0);
        System.out.println(int1);
        
        /**
         * Since user is working with objects now, user can use certain methods
         * to get information about the specific object.
         * For example, the following methods are used to get the value associated
         * with the corresponding wrapper object:
         * 1. intValue()
         * 2. byteValue()
         * 3. shortValue()
         * 4. longValue()
         * 5. floatValue()
         * 6. doubleValue()
         * 7. charValue()
         * 8. booleanValue()
         */
        Long balance = 100000000000L;

        System.out.println(balance.longValue());
    }
}