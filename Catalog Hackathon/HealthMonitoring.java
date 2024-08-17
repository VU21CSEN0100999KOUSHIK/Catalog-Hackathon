import java.util.*;
public class HealthMonitoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] healthReports = new String[10];
        int reportCounter = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("Enter 1 to Add a Health Report");
            System.out.println("Enter 2 to Display Health Reports");
            System.out.println("Enter 3 to Exit");
            System.out.println();
            System.out.print("Enter the option number: ");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine(); 
                System.out.println("Enter the Patient's Name:");
                String patientName = input.nextLine();
                
                System.out.println("Enter the Patient's Age:");
                int patientAge = input.nextInt();

                System.out.println("Enter the Temperature in Celsius:");
                double temperature = input.nextDouble();

                System.out.println("Enter the Blood Pressure in mmHg:");
                int bloodPressure = input.nextInt();

                System.out.println("Enter the Heart Rate in bpm:");
                int heartRate = input.nextInt();

                healthReports[reportCounter] = "Patient: " + patientName + ", Temperature: " + temperature 
                                               + "°C, Blood Pressure: " + bloodPressure 
                                               + " mmHg, Heart Rate: " + heartRate + " bpm";
                reportCounter++;
                System.out.println("Health Report has been added.");

            } else if (option == 2) {
                System.out.println("List of Health Reports:");
                for (int i = 0; i < reportCounter; i++) {
                    System.out.println(healthReports[i]);
                }

            } else if (option == 3) {
                System.out.println("Exiting the program...");
                input.close();
                break;

            } else {
                System.out.println("Invalid selection. Try again.");
            }
        }
    }
}