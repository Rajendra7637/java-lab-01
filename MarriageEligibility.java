import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            
            System.out.print("Enter gender (male/female): ");
            String gender = sc.next().toLowerCase();
            
            switch (gender) {
                case "male" -> {
                    if (age >= 21)
                        System.out.println("Eligible for marriage.");
                    else
                        System.out.println("Not eligible for marriage.");
                }
                case "female" -> {
                    if (age >= 18)
                        System.out.println("Eligible for marriage.");
                    else
                        System.out.println("Not eligible for marriage.");
                }
                default -> System.out.println("Invalid gender.");
            }
        }
    }
}
