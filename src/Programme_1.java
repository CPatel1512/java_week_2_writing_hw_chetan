package javaweek2homework;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables
 * 1.2 Declare one instance method
 * 1.3 Call both the  instance variables in to the instance method in to the print statement
 * 1.4 Declare the main method
 * 1.4 Call the above instance method in to the main method and run the programme
 */
public class Programme_1 {
    //1.1 Declare two instance variables
    int a = 10;
    int b = 20;

    // 1.2 Declare one instance method
    //1.3 Call both the instance variables in to the instance method inside the print statement
    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    //1.4 Declare the main method
    //1.5 call above instance method in to the main method and run the programme
    public static void main(String[] args) {
        Programme_1 programme1 = new Programme_1();
                programme1.instanceMethod();




    }
}
