import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the original unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.next().toLowerCase();

        switch (originalUnit) {
            case "celsius":
                convertCelsius(temperature);
                break;
            case "fahrenheit":
                convertFahrenheit(temperature);
                break;
            case "kelvin":
                convertKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        scanner.close();
    }
    private static void convertCelsius(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        displayResults(celsius, fahrenheit, kelvin);
    }

    private static void convertFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = (fahrenheit + 459.67) * 5 / 9;

        displayResults(celsius, fahrenheit, kelvin);
    }

    private static void convertKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin * 9 / 5) - 459.67;

        displayResults(celsius, fahrenheit, kelvin);
    }

    private static void displayResults(double celsius, double fahrenheit, double kelvin) {
        System.out.println("Converted temperatures:");
        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin: " + kelvin + " K");
    }
}
