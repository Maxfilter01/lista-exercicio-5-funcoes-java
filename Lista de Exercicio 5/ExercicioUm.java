import java.util.Scanner;
public class ExercicioUm{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeroUm = 0, numeroDois = 0, mediaAritimetica;
        

        mediaAritimetica = calcularMedia(numeroUm, numeroDois, scanner);

        System.out.println("A média aritimetica do numeros informados é: " + mediaAritimetica);


        scanner.close();

    }
    public static int calcularMedia(int numeroUm, int numeroDois, Scanner scanner){
        
        System.out.println("Digite o primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        numeroDois = scanner.nextInt();
         int media = (numeroUm + numeroDois)/2;
         return media;

    }
}