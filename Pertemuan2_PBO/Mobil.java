public class Mobil {
    int roda = 4;
    int body = 1;
    String namaMobil;
    int mesin = 1;
    void maju() {
        System.out.println("Maju...");
    }
    void mundur() {
        System.out.println("Mundur...");
    }
    void belok() {
        System.out.println("Belok...");
    }
    void hidupkanMobil(String nama) {
        namaMobil = nama;
        System.out.println("Hidupkan mobil : " + namaMobil);
    }
    void ubahGigiMobil() {
        System.out.println("Ubah gigi mobil : " + namaMobil);
    }
    void matikanMobil() {
        System.out.println("Matikan mobil : " + namaMobil);
        namaMobil = null;
    }
    
}