import java.util.Scanner;

public class CharacterClassification {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            
            if (ch >= '0' && ch <= '9')
                System.out.println("Digit");
            else if (ch >= 'A' && ch <= 'Z')
                System.out.println("Uppercase letter");
            else if (ch >= 'a' && ch <= 'z')
                System.out.println("Lowercase letter");
            else
                System.out.println("Special character");
        }
    }
}
