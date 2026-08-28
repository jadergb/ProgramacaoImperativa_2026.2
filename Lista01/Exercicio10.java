import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> produtos = new ArrayList<>();

        while (true) {
            double preco = teclado.nextDouble();
            if (preco == 0) {
                break;
            }
            produtos.add(preco);
        }
        
        double total = calcularTotal(produtos);
        double desconto = determinarDesconto(total);
        double valorFinal = calcularValorFinal(total, desconto);
        
        System.out.printf("Total da compra: %.2f\n", total);
        System.out.printf("Desconto: %.2f\n", desconto);
        System.out.printf("Valor final: %.2f\n", valorFinal);
        
        teclado.close();
    }

    public static double calcularTotal(ArrayList<Double> produtos) {
        double soma = 0;
        for (double preco : produtos) {
            soma += preco;
        }
        return soma;
    }
    public static double determinarDesconto(double total) {
        if (total > 500.0) {
            return total * 0.15; 
        } else if (total > 200.0) {
            return total * 0.10; 
        } else {
            return 0.0; 
        }
    }
    public static double calcularValorFinal(double total, double desconto) {
        return total - desconto;
    }
}