public class exercicioUmVetores {
    public static void main(String[] args) {
        int[] vetorSoma = new int[5];
        vetorSoma[0] = 21;
        vetorSoma[1] = 21;
        vetorSoma[2] = 21;
        vetorSoma[3] = 21;
        vetorSoma[4] = 21;
        int somaNumeros = 0;

        for(int i = 0; i < vetorSoma.length; i++){
            somaNumeros += vetorSoma[i];
        }

        System.out.println("A soma dos números é " + somaNumeros);
    }
}