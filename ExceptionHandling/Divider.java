import java.util.*;

public class Divider {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        try{
            int User_Input = sc.nextInt();
            int result = 100 / User_Input;
            System.out.println("result : " + result);
        }
        catch(ArithmeticException e){
            System.out.println("not divisiable by 0");
        }
        catch(InputMismatchException I){
            System.out.println("Enter Required Integer..");
        }
        
    }   
}