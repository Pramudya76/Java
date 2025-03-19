package transportasi;

public class car {
    int roda = 4;
    int body = 1;
    String namaMobil;
    int mesin = 1;
    public void maju() {
        System.out.println("Maju...");
    }
    public void mundur() {
        System.out.println("Mundur...");
    }
    public void belok() {
        System.out.println("Belok...");
    }
    public void hidupkanMobil(String nama) {
        namaMobil = nama;
        System.out.println("Hidupkan mobil : " + namaMobil);
    }
    public void ubahGigiMobil() {
        System.out.println("Ubah gigi mobil : " + namaMobil);
    }
    public void matikanMobil() {
        System.out.println("Matikan mobil : " + namaMobil);
        namaMobil = null;
    }
    
}
