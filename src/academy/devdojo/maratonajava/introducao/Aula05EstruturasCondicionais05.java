package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        // Tipos aceito em Switch Case: Char,int,byte,short,String,Enum

        switch (dia) {
            case 1:
                System.out.println("Dom.");
                break;
            case 2:
                System.out.println("Seg.");
                break;
            case 3:
                System.out.println("Ter.");
                break;
            case 4:
                System.out.println("Qua.");
                break;
            case 5:
                System.out.println("Qui.");
                break;
            case 6:
                System.out.println("Sex.");
                break;
            case 7:
                System.out.println("Sab.");
                break;
            default:
                System.out.println("Op. Invalida!");
                break;
        }

        char sexo = 'F';

        switch (sexo) {
            default:
                System.out.println("Sexo invalido.");
                break;
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
        }
    }
}
