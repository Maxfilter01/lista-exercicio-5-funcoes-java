import java.util.Scanner;
public class ExercicioNove {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa para escrever números invertidos");
        System.out.println("--------------------------------------------");

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        System.out.println("O número invertido é: " + numeroReverso(numero));
        scanner.close();
    }
    public static String numeroReverso(int numero){
        String numeroEmLinha= String.valueOf(numero);
        String numeroAoContrario = new StringBuilder(numeroEmLinha).reverse().toString();

        return numeroAoContrario;
        
    }
    
}
