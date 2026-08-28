import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Raio: ");
        double raio = teclado.nextDouble();
        
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        

        double volume = calcularVolume(raio, altura);
        
        System.out.printf("Volume da lata de óleo: %.2f m³\n", volume);
        
        teclado.close();
    }

    public static double calcularVolume(double r, double a) {

        return Math.PI * Math.pow(r, 2) * a;
    }
}