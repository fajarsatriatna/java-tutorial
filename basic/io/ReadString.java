import java.io.*;

/**
 * ReadString class helps user identify the use of taking input from user using BufferedReader.
 * <p>
 * It is a simple class that is used to read a sequence of characters.
 * It has a simple function that reads a character another read
 * which reads, an array of characters, and a readLine() function which reads a line.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #ReadString
 */
public class ReadString {
    
    /**
     * Class constructor.
     */
    public ReadString() {

    }
    
    /**
	 * Executes Java program.
	 * <p>
	 * This <code>main()</code> method is a crucial method where JVM will look for the first time application boostrapped.
	 * The compiler executes the codes starting always from the main function.
	 * 
	 * @param   args        Array-typed argument to retrieve input from the console.
     * @throws  IOException If an input or output exception occured.
	 */
    public static void main(String[] args) throws IOException {

        /**
         * BufferedReader is a class which simplifies reading text from a character input stream.
         * It buffers the characters in order to enable efficient reading of text data.
         * InputStreamReader() is a function that converts the input stream of bytes into
         * a stream of characters so that it can be read as BufferedReader expects a stream of characters.
         * BufferedReader can throw checked Exceptions.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int age;

        try {

            System.out.print("What is your name: ");
            name = br.readLine();

            System.out.print("How old are you: ");
            age = Integer.parseInt(br.readLine());

            System.out.println("My name is " + name);
            System.out.println("I am " + age + " years-old");

            br.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}