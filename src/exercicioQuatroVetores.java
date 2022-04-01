import java.util.Scanner;

public class exercicioQuatroVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de itens da sua lista de compras:");
        int n = leitor.nextInt();
        String[] vetorCompras = new String[n];

        System.out.println("Digite os itens da sua lista de compras:");

        
        for(int i=0; i<vetorCompras.length; i++){
            vetorCompras[i] = leitor.next();
        }

        leitor.close();

        System.out.println("Lista de compras:");
        for (String vetorCompra : vetorCompras) {
            System.out.println(vetorCompra);
        }
    }
}
