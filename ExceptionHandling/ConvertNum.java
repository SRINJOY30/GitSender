public class ConvertNum {
    public static void main(String[] args) {
        String str = "123abc"; 
        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
    
}
