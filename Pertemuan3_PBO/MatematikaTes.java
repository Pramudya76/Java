import java.util.Scanner;

public class MatematikaTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matematika hitung1 = new Matematika();
        Matematika hitung2 = new Matematika();
        Matematika hitung3 = new Matematika();
    
        System.out.print("A : ");
        float a = input.nextFloat();
        System.out.print("B : ");
        float b = input.nextFloat();
        hitung1.Pertambahan(a, b);
        hitung1.Pengurangan(a, b);
        hitung1.Perkalian(a, b);
        hitung1.Pembagian(a, b);

        System.out.print("C : ");
        float c = input.nextFloat();
        System.out.print("D : ");
        float d = input.nextFloat();
        hitung2.Pertambahan(c, d);
        hitung2.Pengurangan(c, d);
        hitung2.Perkalian(c, d);
        hitung2.Pembagian(c, d);

        System.out.print("E : ");
        float e = input.nextFloat();
        System.out.print("F : ");
        float f = input.nextFloat();
        hitung3.Pertambahan(e, f);
        hitung3.Pengurangan(e, f);
        hitung3.Perkalian(e, f);
        hitung3.Pembagian(e, f);


        input.close();
    }
}
