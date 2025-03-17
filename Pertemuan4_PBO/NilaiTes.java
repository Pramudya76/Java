import java.util.Scanner;

public class NilaiTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nilai nilai = new Nilai();

        String ulang;

        while (true) {
            System.out.print("Masukan Nilai : ");
            float a = input.nextFloat();
    
    
            nilai.getNilaiHuruf(a);
            nilai.getPredikat();
            nilai.tampilkan();
            
            System.out.print("Input data lagi? (Y/N): ");
            ulang = input.next();

            if(ulang.equalsIgnoreCase("N") || ulang.equalsIgnoreCase("n")) {
                break;
            }

        }


        input.close();

    }
}
