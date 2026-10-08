import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = Character.toLowerCase(sc.next().charAt(0));
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    System.out.println("Vowel");
                else
                    System.out.println("Consonant");
            } else {
                System.out.println("Not an alphabetic character.");
            }
        }
    }
}
