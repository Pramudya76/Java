import java.util.Scanner;

public class SuhuTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Suhu suhu = new Suhu();

        System.out.print("Masukan Nilai Suhu : ");
        float a = input.nextFloat();
        suhu.CelciusToReamur(a);
        suhu.CelciusToFahrenheit(a);
        suhu.CelciusToKelvin(a);

        System.out.print("Masukan Nilai Suhu : ");
        float b = input.nextFloat();
        suhu.ReamurToCelcius(b);
        suhu.ReamurToFahrenheit(b);
        suhu.ReamurToKelvin(b);

        System.out.print("Masukan Nilai Suhu : ");
        float c = input.nextFloat();
        suhu.FahrenheitToCelcius(c);
        suhu.FahrenheitToReamur(c);
        suhu.FahrenheitToKelvin(c);

        System.out.print("Masukan Nilai Suhu : ");
        float d = input.nextFloat();
        suhu.KelvinToCelcius(d);
        suhu.KelvinToReamur(d);
        suhu.KelvinToFahrenheit(d);

        input.close();
    }
}
