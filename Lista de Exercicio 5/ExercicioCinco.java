import java.util.Scanner;
public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Informe o primeiro número: ");
        int numeroUm = scanner.nextInt();
        scanner.close();
        Contar(numeroUm);

    }
    public static void Contar(int maximo){
        int contador = 0;

        while(contador <= maximo){
            contador++;
            System.out.println("(");
            for(int i = 1; i <= contador; i++){
                System.out.println(contador + ",");
            }
            System.out.println("(");
        }
    }

    
}
