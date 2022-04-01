import java.util.Scanner;

public class exercicioDoisVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[10];

        System.out.println("Algoritmo números pares");
        System.out.println("Digite dez valores:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = leitor.nextInt();
        }

        System.out.println("\n\n\n\nLista de números pares:");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
            }
        }

        leitor.close();
    }
}
