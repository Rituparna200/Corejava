import java.util.Scanner;

public class ConcatenateTwoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the First String: ");
        String str1 = scanner.nextLine();

 
        System.out.print("Enter the Second String: ");
        String str2 = scanner.nextLine();

        
        String concatenatedString = str1 + str2;
        System.out.println("OUTPUT is: " + concatenatedString);

        scanner.close();
    }
}

