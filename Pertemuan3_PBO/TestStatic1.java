public class TestStatic1 {
    public static void main(String[] args) {
        TestStatic ts = new TestStatic();
        ts.satu();
        TestStatic.dua();
        System.out.println("\nMencetak atribut dari a-e:");
        System.out.println("a: " + ts.a);
        System.out.println("b: " + TestStatic.b);
        System.out.println("c: " + ts.c);
        System.out.println("d: " + ts.d);
        System.out.println("'e' tidak bisa dipanggil karena private");
    }
}