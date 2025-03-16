public class Nilai {
    String NIM;
    String Nama;
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    int PNilaiUTS;
    int PNilaiUAS;
    int PNilaiTugas;
    void HitungNilai() {
        PNilaiUTS = nilaiUTS * 20/100; 
        PNilaiUAS = nilaiUAS * 45/100;
        PNilaiTugas = nilaiTugas * 35/100;
    }
    
    void CetakNilai() {
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Nilai Akhir UTS : " + PNilaiUTS);
        System.out.println("Nilai Akhir UAS : " + PNilaiUAS);
        System.out.println("Nilai Akhir Tugas : " + PNilaiTugas);
        System.out.println("Nilai Final : " + (PNilaiUTS + PNilaiUAS + PNilaiTugas));
    }
    
}