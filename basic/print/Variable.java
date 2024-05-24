/**
 * Variable class describes how variables work in Java.
 * <p>
 * Variables are the data containers that save the data values during Java program execution.
 * Every Variable in Java is assigned a data type that designates the type and quantity of value it can hold.
 * A variable is a memory location name for the data.
 * <p>
 * It can be perceived with the help of 3 components that are as follows:
 * <ul>
 * <li>datatype: Type of data that can be stored in this variable.</li>
 * <li>variable_name: Name given to the variable.</li>
 * <li>value: It is the initial value stored in the variable.</li>
 * </ul>
 * <p>
 * In Java, there are 3 kinds of variables:
 * <ul>
 * <li>Local variables.</li>
 * <li>Static variables.</li>
 * <li>Instance variables.</li>
 * </ul>
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Variable
 * @see         #role
 */
public class Variable {
    
    /**
     * Class constructor.
     */
    public Variable() {
        
    }

    /**
     * Class variable to define a role of developer.
     */
    public static String role = "developer";
    
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
         * Local variable within <code>main</code> method.
         */
        String name = "fajar";
        System.out.println("my name is " + name);

        label:{
            
            /**
             * Local variable within <code>label</code> block.
             */
            int age = 26;
            System.out.println("my age is " + age);
        }

        System.out.println("i work as a " + Variable.role);

        /**
         * Employee object.
         * <p>
         * User can simply create an object to call instance variables.
         */
        Employee fajar = new Employee();

        fajar.setHobby("coding");

        System.out.println("fajar\'s hobby is " + fajar.getHobby());
    }
}

/**
 * Employee class is designed to create an employee object.
 * 
 * @author      Fajar Satriatna
 * @version     0.1.0
 * @since       0.1.0
 * @see         #Employee
 * @see         #hobby
 * @see         #setHobby(String hobby)
 * @see         #getHobby
 */
class Employee {

    /**
     * Class constructor.
     */
    public Employee() {

    }

    /**
     * Instance variable to define a hobby of an employee.
     */
    private String hobby;
    
    /**
     * Sets value to this <code>hobby</code> variable.
     * 
     * @param hobby     Argument to set value of this <code>hobby</code> variable.
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    /**
     * Gets value of this <code>hobby</code> variable.
     * 
     * @return  value of hobby.
     */
    public String getHobby() {
        return this.hobby;
    }
}