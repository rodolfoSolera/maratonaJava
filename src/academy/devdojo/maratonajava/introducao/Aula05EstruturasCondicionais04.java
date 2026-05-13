package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04
{
    public static void main(String[] args)
    {
        double salary = 70000;
        double taxeMin = 9.70 / 100;
        double taxeMed = 37.35 / 100;
        double taxeMax = 49.50 / 100;
        double taxeResult;

        if (salary <= 34712)
        {
            taxeResult = salary * taxeMin;
        } else if (salary >= 34713 && salary <= 68507)
        {
            taxeResult = salary * taxeMed;
        } else
        {
            taxeResult = salary * taxeMax;
        }

        System.out.println("Voce deve pagar "+taxeResult+" de taxa!");
    }
}
