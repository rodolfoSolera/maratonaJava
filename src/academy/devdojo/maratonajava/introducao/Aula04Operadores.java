package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int number01 = 10;
        int number02 = 20;
        double result = (double) number01 / number02;

        System.out.println(result);

        // %
        int resto = 21 % 7;

        System.out.println("Resto "+resto);

        // < > <= >= != ==
        boolean isTenGreaterTwenty = 10 > 20;
        boolean isTenLessTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10.0;
        boolean isTenDifferentTwnty = 10 != 20;
        boolean isTenDifferenteTen = 10 != 10.0;

        System.out.println("isTenGreaterTwenty "+isTenGreaterTwenty);
        System.out.println("isTenLessTwenty "+isTenLessTwenty);
        System.out.println("isTenEqualsTwenty "+isTenEqualsTwenty);
        System.out.println("isTenEqualsTen "+isTenEqualsTen);
        System.out.println("isTenDifferentTwnty "+isTenDifferentTwnty);
        System.out.println("isTenDifferenteTen "+isTenDifferenteTen);

         // && (AND)  || (OR) !(NOT)

        int age = 29;
        float salary = 3500F;
        boolean isInsideLawGreaterThirty = age >= 30 && salary <= 4612;
        boolean isInsideLawLessThirty = age < 30 && salary >= 3381;

        System.out.println("isInsideLawGreaterThirty "+isInsideLawGreaterThirty);
        System.out.println("isInsideLawLessThirty "+isInsideLawLessThirty);

        double totalValueAC = 200;
        double totalValueAP = 10000;
        float playStationFiveValue = 5000;
        boolean isPlaystationFive = totalValueAC >= playStationFiveValue || totalValueAP >= playStationFiveValue;

        System.out.println("isPlaystationFive "+isPlaystationFive);

        // += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); // 0
        System.out.println(++contador2); // 1
    }
}
