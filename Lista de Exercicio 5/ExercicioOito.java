import java.util.Scanner;
public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        double taxaImposto = 10;

        System.out.println("O custo de um produto indicado será taxado em 10% no valor");

        System.out.println("Informe o valor de custo do produto: ");
        double custo = scanner.nextDouble();

        double custoComImposto = somaImposto(taxaImposto, custo);

        System.out.println("O custo do produto com imposto é: " + custoComImposto);

        scanner.close();

    }
    public static double somaImposto(double taxaImposto, double custo){
        double valorImposto = custo * (taxaImposto/100);
        double novoValor = custo + valorImposto;
        return novoValor;

    }
    

    }
