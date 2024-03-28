package Task.Task_9;

import java.util.Scanner;

public class Task9_4 {
   

    public static void main(String[] args) {
        System.out.println("\nTask 9_4:  X Printing ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Input4: ");
        int size = scanner.nextInt();
        
        printXPattern(size);
        scanner.close();
    }
    
    public static void printXPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == i || j == size - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

