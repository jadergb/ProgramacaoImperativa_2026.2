import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int qtdAlunos = teclado.nextInt();
        double[] mediasTurma = new double[qtdAlunos];
        
        for (int i = 0; i < qtdAlunos; i++) {
            double n1 = teclado.nextDouble();
            double n2 = teclado.nextDouble();
            double n3 = teclado.nextDouble();
            
            mediasTurma[i] = calcularMediaIndividual(n1, n2, n3);
            
            System.out.println("Aluno " + (i + 1));
            System.out.println("Média: " + mediasTurma[i]);
            
            System.out.println(determinarSituacao(mediasTurma[i]));
        }
        
        System.out.println("Média geral da turma: " + calcularMediaGeral(mediasTurma));
        
        teclado.close();
    }

    public static double calcularMediaIndividual(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public static String determinarSituacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularMediaGeral(double[] medias) {
        if (medias.length == 0) {
            return 0;
        }
        
        double soma = 0;
        for (double media : medias) {
            soma += media;
        }
        
        return soma / medias.length;
    }
}