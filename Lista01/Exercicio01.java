import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();
        
        System.out.printf("Fahrenheit: %.3f\n", calcFahrenheit(celsius));
        System.out.printf("Kelvin: %.2f\n", calcKelvin(celsius));
        System.out.printf("Réaumur: %.3f\n", calcReaumur(celsius));
        System.out.printf("Rankine: %.3f\n", calcRankine(celsius));
        
        teclado.close();
    }

    public static double calcFahrenheit(double c) { return c * 1.8 + 32; }
    public static double calcKelvin(double c) { return c + 273.15; }
    public static double calcReaumur(double c) { return c * 0.8; }
    public static double calcRankine(double c) { return c * 1.8 + 491.67; }
}