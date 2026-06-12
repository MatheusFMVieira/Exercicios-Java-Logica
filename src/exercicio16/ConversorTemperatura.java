package exercicio16;

public class ConversorTemperatura {
    private double fahrenheit;

    public ConversorTemperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double calcularCelsius(){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    @Override
    public String toString() {
        return "Conversor Temperatura fahrenheit: " + fahrenheit + " - Celsius: " + calcularCelsius();
    }
}
