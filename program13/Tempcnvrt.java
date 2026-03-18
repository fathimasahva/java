import java.util.Scanner;

public class Tempcnvrt {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);


while (true) {


System.out.println("\n=== Temperature Converter ===");
System.out.println("1. Celsius to Fahrenheit");
System.out.println("2. Fahrenheit to Celsius");
System.out.println("3. Exit");


System.out.print("Enter your choice: ");
int choice = scanner.nextInt();


scanner.nextLine();


if (choice == 3) {
System.out.println("Exiting program. Goodbye!");
break;
}


System.out.print("Enter the temperature: ");
String userInput = scanner.nextLine();

try {

double temperature = Double.parseDouble(userInput);
double convertedTemp;

switch (choice) {
case 1:

convertedTemp = (temperature * 9 / 5) + 32;
System.out.println(temperature + " °C is equal to " + convertedTemp + " °F");
break;

case 2:

convertedTemp = (temperature - 32) * 5 / 9;
System.out.println(temperature + " °F is equal to " + convertedTemp + " °C");
break;

default:
System.out.println("Error: Invalid menu selection.");
break;
}

} catch (NumberFormatException e) {

System.out.println("Error: Invalid input. You must enter a numerical value.");


System.out.println("Exception details: " + e);
System.out.println("Reason: " + e.getMessage());
}
}


scanner.close();
}
}
