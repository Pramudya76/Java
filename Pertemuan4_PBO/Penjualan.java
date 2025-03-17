public class Penjualan {
    String kode;
    String nama;
    float harga;
    int jumlah;
    float total;
    String bonus;
    
    protected void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = harga * jumlah;
    }

    protected void getTotalPembelian() {
        System.out.println("Total : " + total);
    }

    protected void getBonus() {
        if(total >= 500000 && jumlah > 5) {
            bonus = "Setrika";
            System.out.println("Anda mendapatkan bonus Setrika");
        }else if(total >= 100000 && jumlah > 3) {
            bonus = "Payung";
            System.out.println("Anda mendapatkan bonus Payung");
        }else if(total >= 50000 && jumlah > 2) {
            bonus = "Ballpoint";
            System.out.println("Anda mendapatkan bonus ballpoint");
        }else {
            bonus = "-";
            System.out.println("Anda tidak mendapatkan bonus, maka dari itu belanjalah lebih banyak!");
        }
    }

    protected void cekNota() {
        System.out.println("=======================================================");
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total : " + total);
        System.out.println("Bonus : " + bonus);
        System.out.println("=======================================================");
    }
}




