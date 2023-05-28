import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valordoProduto = 0;

        double novovalor = calcularValorAcrescido(valordoProduto, scanner);

        System.out.println("O valor do produto acrescido de 10% é: R$" + novovalor);

        scanner.close();
        
    }
    public static double calcularValorAcrescido(double valordoProduto, Scanner scanner){
        System.out.println("Informe o valor do produto: ");
        valordoProduto = scanner.nextDouble();

        double acrescimo = (valordoProduto * 10)/100;

        double novovalor = valordoProduto + acrescimo;
        return novovalor;
        
    }
    
}
