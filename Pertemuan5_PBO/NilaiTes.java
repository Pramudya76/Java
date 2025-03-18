import java.util.Scanner;

public class NilaiTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nilai nilai = new Nilai();

        String ulang;
        
        while (true) {
            System.out.print("Masukan jumlah data : ");
            int jumlah = input.nextInt();
            float[] array = new float[jumlah];

            for(int a = 0; a < jumlah; a++) {
                System.out.print("Masukan Nilai : ");
                array[a] = input.nextFloat();
                nilai.getNilaiHuruf(array[a]);
                nilai.getPredikat();
                nilai.tampilkan();
            }
            
            
            
            
            System.out.print("Input data lagi? (Y/N): ");
            ulang = input.next();

            if(ulang.equalsIgnoreCase("N") || ulang.equalsIgnoreCase("n")) {
                break;
            }

        }


        input.close();

    }
}
