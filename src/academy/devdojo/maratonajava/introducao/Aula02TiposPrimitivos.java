package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, float, double, char, byte, long, short, boolean
        int age = (int) 10000000000L;
        float salary = (float) 2000.25F;
        double salaryDouble = 2500;
        char gender = 'M';
        byte ageByte = 10;
        long ageLong = 10;
        short ageShort = 10;
        boolean valueTrue = true;
        boolean valueFalse = false;
        String nome = "Rodolfo!";

        System.out.println("A idade é " +age+ " anos!");
        System.out.println("O Salário é " +salary);
        System.out.println("O Salário é " +salaryDouble);
        System.out.println("O Gênero é " +gender);
        System.out.println("A idade é " +ageByte+ " anos!");
        System.out.println("A idade é " +ageLong+ " anos!");
        System.out.println("A idade é " +ageShort+ " anos!");
        System.out.println("Verdadeiro " +valueTrue);
        System.out.println("False " +valueFalse);
        System.out.println("Olá, meu nome é "+nome);
    }
}
