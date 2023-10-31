import java.util.Scanner;

public class SumAndProduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();

        
        System.out.print("Enter the second Number: ");
        int num2 = sc.nextInt();

        
        int sum = num1 + num2;
        int product = num1 * num2;

        
        System.out.println("Sum of the two number is: " + sum);
        System.out.println("Product of the two number is: " + product);

        sc.close();
    }
}

    
45
