package Task.Task_9;

import java.util.Scanner;

public class Task9_7 {
    

        public static void main(String[] args) {
            System.out.println("\nTask 9_7: largest Number ");
            Scanner scanner = new Scanner(System.in);
            
            // Input: Three numbers
            System.out.println("Enter three numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();
            
            double largestNumber = findLargestNumber(num1, num2, num3);
            
            // Output: Largest Number
            System.out.println("Largest number: " + largestNumber);
            scanner.close();
        }
        
        public static double findLargestNumber(double num1, double num2, double num3) {
            double largest = num1;
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            return largest;
        }
    }
    
