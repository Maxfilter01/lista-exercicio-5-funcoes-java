import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        double numeroUm = scanner.nextDouble();

        System.out.println("Informe o segundo numero: ");
        double numeroDois = scanner.nextDouble();
        
        System.out.println("Informe o terceiro numero: ");
        double numeroTres = scanner.nextDouble();
        
        double mediaAritimetica = calcularMediaAritimetica(numeroUm, numeroDois, numeroTres, scanner);
        double mediaHarmonica = calcularMediaHarmonica(numeroUm, numeroDois, numeroTres, scanner);
        double mediaGeometrica = calcularMediaGeometrica(numeroUm, numeroDois, numeroTres, scanner);
        
        System.out.println("O resultado da media aritimetica é: " + mediaAritimetica);
        System.out.println("O resultado da media harmonica é: " + mediaHarmonica);
        System.out.println("O resultado da media geometrica é: " + mediaGeometrica);
        
        scanner.close();
    }
    public static double calcularMediaAritimetica(double numeroUm, double numeroDois, double numeroTres, Scanner scanner){
        
        double mediaAritimetica = (numeroUm + numeroDois + numeroTres)/3;
        return mediaAritimetica;
    }
    public static double calcularMediaHarmonica(double numeroUm, double numeroDois, double numeroTres, Scanner scanner){
        double mediaHarmonica = 3/((1/numeroUm) + (1/numeroDois) + (1/numeroTres));
        return mediaHarmonica;
    }
    public static double calcularMediaGeometrica(double numeroUm, double numeroDois, double numeroTres, Scanner scanner){

        double mediaGeometrica = Math.sqrt((numeroUm * numeroDois * numeroTres));
        return mediaGeometrica;
    }
    

}
