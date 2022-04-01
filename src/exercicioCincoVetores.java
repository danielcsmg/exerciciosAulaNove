import java.util.Scanner;

public class exercicioCincoVetores {
    public static void main(String[] args) {
        System.out.println("Algoritmo banda e músicas");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de uma banda");
        String nomeBanda = leitor.nextLine();
        String listaMusicas[] = new String[3];

        System.out.println("Digite o nome três músicas dessa banda:");
        for (int i = 0; i < 3; i++) {
            listaMusicas[i] = leitor.nextLine();
        }

        System.out.println("\n" + nomeBanda + "\n");
        for (int i = 0; i < 3; i++) {
            System.out.println(listaMusicas[i]);
        }

        leitor.close();
    }
}
