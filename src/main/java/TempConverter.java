import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConvertTemp temp = new ConvertTemp();

        System.out.println("Press 1 if you want to convert Celcius to Fahrenheit:");
        System.out.println("Press 2 if you want to convert Fahrenheit to Celcius:");
        int choice = scanner.nextInt();

        switch(choice){

            case 1: System.out.println("Enter degrees in Celcius:");
                double inputCelcius = scanner.nextDouble();
                System.out.println( "Degrees in Fahrenheit is: " + temp.convertToFahrenheit(inputCelcius));
                break;
            case 2: System.out.println("Enter degrees in Fahrenheit:");
                double inputFahrenheit = scanner.nextDouble();
                System.out.println( "Degrees in Celcius is: " + temp.convertToCelcius (inputFahrenheit));
                break;
            default: System.out.println("Not a valid choice.");
        }

    }
}