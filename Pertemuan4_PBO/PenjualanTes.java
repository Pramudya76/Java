import java.util.Scanner;

public class PenjualanTes {
    public static void main(String[] args) {
        Penjualan penjualan = new Penjualan();
        Scanner input = new Scanner(System.in);

        String ulang;

        while (true) {
            System.out.print("Masukan kode : ");
            String kode = input.next();
            System.out.print("Masukan nama : ");
            String nama = input.next();
            System.out.print("Masukan harga : ");
            float harga = input.nextFloat();
            System.out.print("Masukan jumlah : ");
            int jumlah = input.nextInt();
            
            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.getTotalPembelian();
            penjualan.getBonus();
            penjualan.cekNota();

            System.out.print("Input data lagi? (Y/N): ");
            ulang = input.next();

            if(ulang.equalsIgnoreCase("N") || ulang.equalsIgnoreCase("n")) {
                break;
            }


        }





        input.close();
    }
}
