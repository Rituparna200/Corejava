public class ReversNumber {

    
        public static void main(String[] args) {
            int number = 678; 
            System.out.println("Original number: " + number);
            if (number >= 100 && number <= 999) {
               
                int digit1 = number % 10;
                number /= 10;
                int digit2 = number % 10;
                number /= 10;
                int digit3 = number;
    
            
                int reversedNumber = digit1 * 100 + digit2 * 10 + digit3;
                
                System.out.println("Reversed number: " + reversedNumber);
            } 
            else {
                System.out.println("Please provide a valid 3-digit number.");
            }
        }
    }
    
    

