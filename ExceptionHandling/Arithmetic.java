public class Arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            @SuppressWarnings("unused")
            int result = a / b; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Print the exception message
        } finally {
            System.out.println("Execution completed.");
        }
    }
    
}
