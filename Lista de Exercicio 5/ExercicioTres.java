import java.util.Scanner;
public class ExercicioTres {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double temperatura, conversao;
    
    System.out.println("Informe a temperatura fahrenheit :  ");
    temperatura = scanner.nextDouble();

    conversao = conversaoparaCelsius(temperatura, scanner);

    System.out.println("O valor da temperatura em Graus Celsios é: " + conversao);
   
    scanner.close();
 }
 public static double conversaoparaCelsius(double temperatura, Scanner scanner){

   
    double conversao = ((temperatura - 32)/1.8);
    return conversao;
    
} 
 
 
}
