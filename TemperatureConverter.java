import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner for user input

        // temperature in Celsius
        System.out.println("Enter the temperature in Celsius:");
        if (sc.hasNextFloat()) {
            float tempCelsius = sc.nextFloat();
            float tempFahrenheit = (tempCelsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit
            System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);
        } else {
            System.out.println("Invalid input! Please enter a number.");
            sc.next();
        }

        //  temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit:");
        if (sc.hasNextFloat()) {
            float tempFahrenheit = sc.nextFloat();
            float tempCelsius = (tempFahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius
            System.out.println("Temperature in Celsius: " + tempCelsius);
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        sc.close(); //
    }
}