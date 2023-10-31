import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        
        System.out.println("Original numbers: num1 = " + num1 + ", num2 = " + num2);

        
        int temp = num1;
        num1 = num2;
        num2 = temp;

        
        System.out.println("Swapped numbers: num1 = " + num1 + ", num2 = " + num2);

        sc.close();
    }
}

