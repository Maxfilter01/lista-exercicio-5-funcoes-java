public class ExercicioSeis {
    public static void main(String[] args) {
        int numeroUm = 8;
        int numeroDois = 2;
        int numeroTres = 9;
        int resultado = somaDosNumeros(numeroUm, numeroDois, numeroTres);
        System.out.println("A soma dos números é: " + resultado); 

    }
    public static int somaDosNumeros(int numeroUm, int numeroDois, int numeroTres){
        int soma = numeroUm + numeroDois + numeroTres;
        return soma;

    }
    
}
