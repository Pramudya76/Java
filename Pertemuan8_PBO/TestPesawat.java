public class TestPesawat {
    public static void main(String[] args) {
        //pd turunan tidak bisa mengakses fungsi dari parentnya
        Pesawat pesawat = new Pesawat(2, 1);
        pesawat.terbang();
        pesawat.mendarat();

        PesawatTempur pesawatTempur = new PesawatTempur(4, 1);
        pesawatTempur.manuver();
        pesawatTempur.terbang();
        pesawatTempur.mendarat();


    }
}
