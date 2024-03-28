package Task.Task_9;

import java.util.Scanner;

public class Task9_5 {

   
    public static void main(String[] args) {
        System.out.println("\nTask 9_5: Anna University grading system ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks scored by the student: ");
        int marks = scanner.nextInt();
        scanner.close();
        
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input");
        } else {
            String grade = calculateGrade(marks);
            System.out.println("Grade: " + grade);
        }
    }
    public static String calculateGrade(int marks) {
        if (marks >= 100 && marks <= 100) {
            return "S";
        } else if (marks >= 90 && marks <= 99) {
            return "A";
        } else if (marks >= 80 && marks <= 89) {
            return "B";
        } else if (marks >= 70 && marks <= 79) {
            return "C";
        } else if (marks >= 60 && marks <= 69) {
            return "D";
        } else if (marks >= 50 && marks <= 59) {
            return "E";
        } else {
            return "F";
        }
    }
    
}
