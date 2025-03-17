import java.util.Scanner;

public class WaktuTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Waktu waktu = new Waktu();

        String ulang;

        while (true) {
            System.out.print("Masukan Detik : ");
            int a = input.nextInt();
    
            waktu.konversi(a);
            waktu.tampilkan();
            
            System.out.print("Input data lagi? (Y/N): ");
            ulang = input.next();

            if(ulang.equalsIgnoreCase("N") || ulang.equalsIgnoreCase("n")) {
                break;
            }

        }

        

        input.close();


    }
}
