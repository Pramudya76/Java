public class TesNilai {
    public static void main(String[] args) {
        Nilai Nilaiku = new Nilai();
        Nilaiku.Nama = "Pramudya Putra Pratama";
        Nilaiku.NIM = "A11.2023.15414";
        Nilaiku.nilaiUTS = 85;
        Nilaiku.nilaiUAS = 90;
        Nilaiku.nilaiTugas = 75;
        Nilaiku.HitungNilai();
        Nilaiku.CetakNilai();
        Nilai Nilaimu = new Nilai();
        Nilaimu.Nama = "Bianka Ataegina";
        Nilaimu.NIM = "A11.2022.14545";
        Nilaimu.nilaiUTS = 80;
        Nilaimu.nilaiUAS = 85;
        Nilaimu.nilaiTugas = 90;
        Nilaimu.HitungNilai();
        Nilaimu.CetakNilai();
    }
}
