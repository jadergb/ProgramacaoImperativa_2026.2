import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int qtdFuncionarios = teclado.nextInt();
      
        double[] salarios = new double[qtdFuncionarios];

        for (int i = 0; i < qtdFuncionarios; i++) {
            salarios[i] = teclado.nextDouble();
        }
  
        System.out.printf("Média salarial: %.2f\n", calcularMedia(salarios));
        
        teclado.close();
    }

    public static double calcularMedia(double[] salarios) {
        if (salarios.length == 0) {
            return 0;
        }
        
        double soma = 0;
        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }
        
        return soma / salarios.length;
    }
}