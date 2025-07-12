public class HelloWorld {

    // This is the main method. It is the entry point of any Java application.
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        // Call a method to add two numbers
        int result = addNumbers(10, 20);
        System.out.println("The sum is: " + result);
    }

    // User-defined method to add two integers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
