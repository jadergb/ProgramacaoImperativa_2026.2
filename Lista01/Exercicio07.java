import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero = teclado.nextInt();
        
        long fatorial = calcularFatorial(numero);  

        System.out.println("Fatorial: " + fatorial);
        
        teclado.close();
    }

    public static long calcularFatorial(int n) {
        long resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
}