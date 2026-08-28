import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int totalSegundos = teclado.nextInt();
        
        System.out.println(calcularHoras(totalSegundos) + " hora(s)");
        System.out.println(calcularMinutos(totalSegundos) + " minuto(s)");
        System.out.println(calcularSegundos(totalSegundos) + " segundo(s)");
        
        teclado.close();
    }

    public static int calcularHoras(int total) {
        return total / 3600; 
    }

    public static int calcularMinutos(int total) {
        return (total % 3600) / 60; 
    }

    public static int calcularSegundos(int total) {
        return total % 60; 
    }
}