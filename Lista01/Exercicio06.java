import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Massa: ");
        double massa = teclado.nextDouble();
        
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        
        System.out.print("Tempo: ");
        double tempo = teclado.nextDouble();
        
        double potencia = calcularPotenciaHP(massa, altura, tempo);
        
        System.out.printf("Potência necessária: %.3f hp\n", potencia);
        
        teclado.close();
    }

    public static double calcularPotenciaHP(double m, double h, double t) {
        double g = 9.81;
        

        double p = (m * g * h) / t;
        

        return p / 745.6999;
    }
}