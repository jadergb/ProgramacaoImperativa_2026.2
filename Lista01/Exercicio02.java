import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] sexos = new int[10];
        double[] alturas = new double[10];
        
        // Leitura dos dados
        for (int i = 0; i < 10; i++) {
            sexos[i] = teclado.nextInt();
            alturas[i] = teclado.nextDouble();
        }
        
       
        System.out.printf("Maior altura: %.2f m\n", calcularMaiorAltura(alturas));
        System.out.printf("Menor altura: %.2f m\n", calcularMenorAltura(alturas));
        System.out.printf("Média de altura dos homens: %.2f m\n", calcularMediaHomens(alturas, sexos));
        System.out.println("Número de mulheres: " + contarMulheres(sexos));
        
        teclado.close();
    }

    public static double calcularMaiorAltura(double[] alturas) {
        double maior = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
        }
        return maior;
    }

    public static double calcularMenorAltura(double[] alturas) {
        double menor = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }
        return menor;
    }

    public static double calcularMediaHomens(double[] alturas, int[] sexos) {
        double soma = 0;
        int quantidade = 0;
        
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 2) { 
                soma += alturas[i];
                quantidade++;
            }
        }
        
        if (quantidade == 0) {
            return 0; 
        }
        return soma / quantidade;
    }

    public static int contarMulheres(int[] sexos) {
        int quantidade = 0;
        for (int sexo : sexos) {
            if (sexo == 1) { 
                quantidade++;
            }
        }
        return quantidade;
    }
}
