import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantItens = leitor.nextInt();

        String[] listaTexto = new String[quantItens];
        leitor.nextLine();
        for(int i = 0; i < listaTexto.length; i++){
            System.out.println("insira os valor "+i);
            listaTexto[i] = leitor.nextLine();
        }

        for(String elemento : listaTexto){
            System.out.println(elemento);
        }
        leitor.close();
    }
}
