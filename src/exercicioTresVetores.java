import java.util.Scanner;

public class exercicioTresVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String listaAlunos[] = new String[10];

        System.out.println("Algoritmo lista de alunos");
        System.out.println("Digite o nome de dez alunos:");
        for (int i = 0; i < 10; i++) {
            listaAlunos[i] = leitor.nextLine();
        }

        System.out.println("\n\n\n\nLista de alunos");
        for (int i = 0; i < 10; i++) {
            System.out.println(listaAlunos[i]);
        }

        leitor.close();
    }
}
