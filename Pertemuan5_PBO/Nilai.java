public class Nilai {
    String nHuruf;
    String predikat;


    public String getNilaiHuruf(float nilai) {
        if(nilai >= 85 && nilai <= 100) {
            this.nHuruf = "A";
        }else if(nilai >= 80 && nilai < 85 ) {
            this.nHuruf = "AB";
        }else if(nilai >= 70 && nilai < 80) {
            this.nHuruf = "B";
        }else if(nilai >= 65 && nilai < 70) {
            this.nHuruf = "BC";
        }else if(nilai >= 60 && nilai < 65) {
            this.nHuruf = "C";
        }else if(nilai >= 50 && nilai < 60) {
            this.nHuruf = "D";
        }else if (nilai >= 0 && nilai < 50) {
            this.nHuruf ="E";
        }else {
            this.nHuruf = "E";
        }
        return this.nHuruf;
    }


    public void getPredikat() {
        switch (nHuruf) {
            case "A":
                this.predikat = "Istimewa";
                break;
            case "AB":
                this.predikat = "Sangat Baik";
                break;
            case "B":
                this.predikat = "Baik";
                break;
            case "BC":
                this.predikat = "Cukup Baik";
                break;
            case "C":
                this.predikat = "Cukup";
                break;
            case "D":
                this.predikat = "Kurang";
                break;
            case "E":
                this.predikat = "Sangat Kurang";
                break;
            default:
                this.predikat = null; 
                break;
        }
    }

    public void tampilkan() {
        System.out.println("Nilai Huruf : " + nHuruf);
        System.out.println("Predikat : " + predikat);
    }



}
