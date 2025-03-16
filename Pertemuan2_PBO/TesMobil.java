public class TesMobil {
    public static void main(String[] args) {
        Mobil Nissa = new Mobil();
        Mobil Ferrari = new Mobil();
        Nissa.hidupkanMobil("Nissan Skyline GT-R R34");
        Ferrari.namaMobil = "Ferrari Testarossa";
        Nissa.ubahGigiMobil();
        Nissa.maju();
        Nissa.mundur();
        Nissa.belok();
        System.out.println("Roda " + Nissa.namaMobil + " : " + Nissa.roda);
        System.out.println("Roda " + Ferrari.namaMobil + " : " + Ferrari.roda);
        System.out.println("Mesin " + Nissa.namaMobil + " : " + Nissa.mesin);
        System.out.println("Mesin " + Ferrari.namaMobil + " : " + Ferrari.mesin);
        Ferrari.roda = 5;
        System.out.println("Roda " + Ferrari.namaMobil + " : " + Ferrari.roda);
        Ferrari.mesin = 9;
        Nissa.mesin = 9;
        System.out.println("Mesin " + Nissa.namaMobil + " : " + Nissa.mesin);
        System.out.println("Mesin " + Ferrari.namaMobil + " : " + Ferrari.mesin);
        Nissa.matikanMobil();
    }
}
