package Task.Task_9;

import java.util.Scanner;

public class Task9_2 {
   

    public static void main(String[] args) {
        System.out.println("\nTask 9_2:  Reverse String ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }
}

    

