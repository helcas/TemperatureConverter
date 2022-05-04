

public class ConvertTemp {

    private double celcius;
    private double fahrenheit;



    public double convertToFahrenheit(double celcius){
        double fahrenheit = (celcius * (1.8)) + 32;
        return Math.round(fahrenheit * 100.0) / 100.0;
    }

    public double convertToCelcius (double fahrenheit){

        celcius = (fahrenheit - 32) / (1.8);
        return Math.round(celcius * 100.0) / 100.0;

    }
}
