package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 1000000

        int numero = 0;
        while (numero <= 1000000) {
            System.out.println("Numero "+numero+" par!");
            numero+=2;
        }

        numero = 0;
        do {
            System.out.println("Numero "+numero+" par!");
            numero+=2;
        } while (numero <= 1000000);

        for (numero=0;numero<=1000000;numero++) {
            if (numero % 2 == 0) {
                System.out.println("Numero for "+numero+" par!");
            }
        }
    }
}
