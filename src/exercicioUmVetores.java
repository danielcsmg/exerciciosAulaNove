import java.util.Scanner;

public class exercicioUmVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorSoma = new int[5];
        int somaNumeros = 0;

        System.out.println("Digite cinco valores:");
        for(int i = 0; i < 5; i++){
            vetorSoma[i] = leitor.nextInt();
            somaNumeros += vetorSoma[i];
        }

        leitor.close();

        System.out.println("A soma dos números é " + somaNumeros);
    }
}