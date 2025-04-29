public class CheckAge {
    public static void main(String[] args) throws Exception {
        int age = 15;
        try {
            InvalidAgeException obj = new InvalidAgeException();
            obj.CheckAge(age);
        } catch (Exception e) {
            System.out.println("Age is less than 18, not eligible to vote.");
        } 
    }
}
class InvalidAgeException extends Exception {
    
    void CheckAge(int age) throws Exception {
        if (age < 18) {
            throw new InvalidAgeException();
        } else {
            System.out.println("Eligible to vote.");
        }
    }
}