import java.util.Scanner;

/**
 * ReadStringWithScanner describes how to take input sophisticatedly using Scanner class.
 * <p>
 * It is an advanced version of BufferedReader which was added in later versions of Java.
 * The scanner can read formatted input. It has different functions for different types of data types.
 * <ul>
 * <li>The scanner is much easier to read as we don't have to write throws as there is no exception thrown by it.</li>
 * <li>It was added in later versions of Java.</li>
 * <li>It contains predefined functions to read an Integer, Character, and other data types as well.</li>
 * </ul>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #ReadStringWithScanner
 */
public class ReadStringWithScanner {

    /**
     * Class constructor.
     */
    public ReadStringWithScanner() {

    }
    
    /**
	 * Executes Java program.
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param args Array-typed argument to retrieve input from the console.
	 */
    public static void main(String[] args) {

        /**
         * The Scanner class is used to get user input and it is found in the java.util package.
         */
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        
        System.out.print("What is your name: ");
        name = sc.nextLine();
        System.out.print("How old are you: ");
        age = sc.nextInt();

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years-old");
        sc.close();
    }
}