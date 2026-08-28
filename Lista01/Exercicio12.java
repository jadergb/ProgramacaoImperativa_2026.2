import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite números inteiros positivos (-1 para sair):");
        while (true) {
            int num = teclado.nextInt();
            if (num == -1) break;
            numeros.add(num);
        }
        
        if (!numeros.isEmpty()) {
            System.out.println("Quantidade de números: " + contarValidos(numeros));
            System.out.println("Soma: " + somarNumeros(numeros));
            System.out.println("Média: " + calcularMedia(numeros));
            System.out.println("Maior número: " + encontrarMaior(numeros));
            System.out.println("Menor número: " + encontrarMenor(numeros));
            System.out.println("Quantidade de pares: " + contarPares(numeros));
            System.out.println("Quantidade de ímpares: " + contarImpares(numeros));
        }
        teclado.close();
    }

    public static int contarValidos(ArrayList<Integer> lista) { return lista.size(); }
    
    public static int somarNumeros(ArrayList<Integer> lista) {
        int soma = 0;
        for (int n : lista) soma += n;
        return soma;
    }
    
    public static double calcularMedia(ArrayList<Integer> lista) {
        return (double) somarNumeros(lista) / contarValidos(lista);
    }
    
    public static int encontrarMaior(ArrayList<Integer> lista) {
        int maior = lista.get(0);
        for (int n : lista) if (n > maior) maior = n;
        return maior;
    }
    
    public static int encontrarMenor(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        for (int n : lista) if (n < menor) menor = n;
        return menor;
    }
    
    public static int contarPares(ArrayList<Integer> lista) {
        int pares = 0;
        for (int n : lista) if (n % 2 == 0) pares++;
        return pares;
    }
    
    public static int contarImpares(ArrayList<Integer> lista) {
        return contarValidos(lista) - contarPares(lista);
    }
}