package Task.Task_9;

import java.util.Scanner;
public class Task9_1 {
    
    public static void main(String[] args) {
        System.out.println("\nTask 9_1:  String radarPalindrome ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
    
    public static boolean isPalindrome(String str) {
        int length = str.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
               
            }
            
        }
        return true;
    }
}


