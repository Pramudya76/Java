class KaryawanTetap extends Karyawan {

    public void menghitungGajiFinal(int gajiPokok, float tunjangan) {
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.gajiTotal = gajiPokok + (gajiPokok * (tunjangan / 100));
        System.out.println("Gaji Final Karyawan Tetap : " + gajiTotal);
        //System.out.println(tunjangan);
    }

}

class KaryawanKontrak extends Karyawan {
    public void menghitungGajiFinal(int upahHarian, int hariMasuk) {
        this.upahHarian = upahHarian;
        this.hariMasuk = hariMasuk;
        this.gajiTotal = upahHarian * hariMasuk;
        System.out.println("Gaji Final Karyawan Kontrak : " + gajiTotal);
    }

}


public class KaryawanDemo {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap();
        KaryawanKontrak kk = new KaryawanKontrak();

        kt.menghitungGajiFinal(5000000, 5);
        kk.menghitungGajiFinal(100000, 30);


    }
}
