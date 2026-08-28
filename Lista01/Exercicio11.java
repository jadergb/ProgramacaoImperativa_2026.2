import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
        }
        
        System.out.println("Maior número: " + encontrarMaior(numeros));
        System.out.println("Menor número: " + encontrarMenor(numeros));
        System.out.println("Quantidade de pares: " + contarPares(numeros));
        System.out.println("Média: " + calcularMedia(numeros));
        
        teclado.close();
    }

    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static int contarPares(int[] numeros) {
        int pares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static double calcularMedia(int[] numeros) {
        double soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
}