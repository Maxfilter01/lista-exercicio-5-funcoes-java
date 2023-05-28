import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Verificador de números positivo e negativos");
      System.out.println("---------------------------------------------");

      System.out.println("Informe qualquer número inteiro: ");
      int numero = scanner.nextInt();

      char resultado = verificarPositivoeNegativo(numero);
      System.out.println("O valor é: " + resultado);

      scanner.close();

    }
    public static char verificarPositivoeNegativo(int numero){
        if(numero > 0){
            return 'P';
        }
        else{
            return 'N';
        }
    }
}
