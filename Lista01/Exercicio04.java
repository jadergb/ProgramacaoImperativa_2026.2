import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Altura da parede: ");
        double alturaParede = teclado.nextDouble();
        
        System.out.print("Largura da parede: ");
        double larguraParede = teclado.nextDouble();
        
        System.out.print("Altura do azulejo: ");
        double alturaAzulejo = teclado.nextDouble();
        
        System.out.print("Largura do azulejo: ");
        double larguraAzulejo = teclado.nextDouble();
        
        int quantidade = calcularAzulejos(alturaParede, larguraParede, alturaAzulejo, larguraAzulejo);
        
        System.out.println("Quantidade de azulejos necessários: " + quantidade);
        
        teclado.close();
    }

    public static int calcularAzulejos(double altParede, double largParede, double altAzulejo, double largAzulejo) {
        double areaParede = altParede * largParede;
        double areaAzulejo = altAzulejo * largAzulejo;
        double quantidadeExata = areaParede / areaAzulejo;
        
        return (int) Math.ceil(quantidadeExata);
    }
}