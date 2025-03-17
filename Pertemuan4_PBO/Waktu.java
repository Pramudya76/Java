public class Waktu {
    int detik;
    int menit;
    int jam;
    int hari;

    public void konversi(int detik) {
        this.hari = detik / 86400 ;
        detik %= 86400;

        this.jam = detik / 3600 ;
        detik %= 3600;

        this.menit = detik / 60 ;
        detik %= 60;

        this.detik = detik;
    }

    public void tampilkan() {
        System.out.println("Detik : " + detik);
        System.out.println("Menit : " + menit);
        System.out.println("Jam : " + jam);
        System.out.println("Hari : " + hari);
    }
}
