package Task.Task_9;

import java.util.Scanner;

public class Task9_6 {
    
        public static void main(String[] args) {
            System.out.println("\nTask 9_6: Hotel Tariff Calculator ");
            Scanner scanner = new Scanner(System.in);
            
            // Input: Month, Room Rent per Day, Number of Days Stayed
            System.out.print("Enter the month (1-12): ");
            int month = scanner.nextInt();
            
            System.out.print("Enter the room rent per day: ");
            double roomRentPerDay = scanner.nextDouble();
            
            System.out.print("Enter the number of days stayed: ");
            int daysStayed = scanner.nextInt();
            
            double totalTariff = calculateTariff(month, roomRentPerDay, daysStayed);
            
            // Output: Total Tariff
            System.out.printf("Total Tariff: %.2f\n", totalTariff);
            scanner.close();
        }
        
        public static double calculateTariff(int month, double roomRentPerDay, int daysStayed) {
            double totalTariff;
            switch (month) {
                case 4:
                case 5:
                case 6:
                case 11:
                case 12:
                    totalTariff = roomRentPerDay * daysStayed * 1.20; // 20% increase during peak seasons
                    break;
                default:
                    totalTariff = roomRentPerDay * daysStayed;
            }
            return totalTariff;
        }
    }
        

