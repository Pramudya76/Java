public class Pesawat {
    int sayap, ekor;

    Pesawat(int sayap, int ekor) {
        this.sayap = sayap;
        this.ekor = ekor;
    }

    public void terbang() {
        System.out.println("Pesawat terbang");
    }

    public void mendarat() {
        System.out.println("Pesawat mendarat");
    }





}

class PesawatTempur extends Pesawat{
    PesawatTempur(int sayap, int ekor) {
        super(sayap, ekor);
    }

    public void manuver() {
        System.out.println("Pesawat tempur manuver");
    }
    @Override
    public void terbang() {
        System.out.println("Pesawat tempur terbang");
    }

}
