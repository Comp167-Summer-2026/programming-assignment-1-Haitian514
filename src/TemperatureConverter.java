import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            return (temperature * 9.0 / 5.0) + 32;
        }
        else {
            return (temperature - 32) * 5.0 / 9.0;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String input = "";

        while (!input.equalsIgnoreCase("stop")) {

            System.out.print("Enter a temperature value or type stop to quit: ");
            input = scnr.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Program ended.");
            }
            else if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Error: Invalid temperature input.");
            }
            else {
                double temperature = Double.parseDouble(input);

                String unit = "";
                boolean validUnit = false;

                while (!validUnit) {
                    System.out.print("Enter unit (C or F): ");
                    unit = scnr.nextLine();

                    if (unit.equalsIgnoreCase("C") ||
                            unit.equalsIgnoreCase("F")) {
                            validUnit = true;
                    }
                    else {
                        System.out.println("Error: Invalid unit. Enter C or F.");
                    }
        }

double converted = convertTemperature(temperature, unit);

if (unit.equalsIgnoreCase("C")) {
    System.out.printf("%.2f C is equal to %.2f F%n",
            temperature, converted);
}
else {
    System.out.printf("%.2f F is equal to %.2f C%n",
            temperature, converted);
}
            }
        }

        scnr.close();
    }
}
