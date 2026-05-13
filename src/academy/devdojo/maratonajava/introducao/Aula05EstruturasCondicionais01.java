package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade>=18;
        // ! Negacao
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida!");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao Autorizado a comprar bebida!");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito!");
        }
        System.out.println("Fora do if!");
    }
}
