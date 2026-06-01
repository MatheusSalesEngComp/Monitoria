package pacote;
public class ConversorTemperatura {
    public static final Double KELVIN_OFFSET = 273.15;
    public static Double celsiusParaFahrenheit(double celsius){
        double Fahrenheit,  Celsius = celsius;
        Fahrenheit = (Celsius * 9/5) + 32; 
        return Fahrenheit;
    }
    public static Double fahrenheitParaCelsius(double fahrenheit){
        double Fahrenheit = fahrenheit,  Celsius;
 
        Celsius = (Fahrenheit - 32) * 5/9;

        return Celsius;
    }
}
