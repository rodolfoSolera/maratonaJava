package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;

/**
 Prática

 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salário> , na data <data>.
 */
public class Aula03TipoPrimitivosExercicios {
    public static void main(String[] args) {

        String name = "Rodolfo Pitondo Solera";
        String address = "Rua Ida Friedel Behling, 236 Apto 102 - Três Rios do Norte";
        double salary = 7200.45;
        String salaryReceiptDate = "06/06/2026";
        String relatory = "Eu "+name+", morando no endereço "+address+",confirmo que recebi o salário de R$ "+salary+" , na data "+salaryReceiptDate+".";

        System.out.println(relatory);
    }
}
