package Task.Task_9;

import java.util.Scanner;

public class Task9_3 {
    
    public static void main(String[] args) {
        System.out.println("\nTask 9_3:  Pattern Printing ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        printPattern(rows);
        scanner.close();
    }
    
    public static void printPattern(int rows) {
        int counter = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}


