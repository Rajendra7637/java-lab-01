import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a 3-digit number: ");
            int n = sc.nextInt();
            
            if (n < 100 || n > 999) {
                System.out.println("Please enter a 3-digit number.");
            } else {
                int original = n;
                int digit1 = n / 100;
                int digit2 = (n / 10) % 10;
                int digit3 = n % 10;
                
                int sum = digit1 * digit1 * digit1
                        + digit2 * digit2 * digit2
                        + digit3 * digit3 * digit3;
                
                if (sum == original)
                    System.out.println("Armstrong number");
                else
                    System.out.println("Not an Armstrong number");
            }
        }
    }
}
