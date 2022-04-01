public class exercicioUmVetores {
    public static void main(String[] args) {
        int[] vetorSoma = new int[5];
        vetorSoma[0] = 21;
        vetorSoma[1] = 215;
        vetorSoma[2] = 21;
        vetorSoma[3] = 0;
        vetorSoma[4] = 21;
        int somaNumeros = 0;

        for(int soma : vetorSoma){
            somaNumeros += soma;
        }

        System.out.println("A soma dos números é " + somaNumeros);
    }
}