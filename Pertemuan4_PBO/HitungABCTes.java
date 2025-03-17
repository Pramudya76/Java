import java.util.Scanner;

public class HitungABCTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HitungABC hitungABC = new HitungABC();

        String ulang;

        while (true) {
            System.out.print("Masukan nilai a : ");
            int a = input.nextInt();
            System.out.print("Masukan nilai b : ");
            int b = input.nextInt();
            System.out.print("Masukan nilai c : ");
            int c = input.nextInt();
    
            hitungABC.setData(a, b, c);
            hitungABC.getX1X2();
            hitungABC.tampilkanData();

            System.out.print("Input data lagi? (Y/N): ");
            ulang = input.next();

            if(ulang.equalsIgnoreCase("N") || ulang.equalsIgnoreCase("n")) {
                break;
            }

        }


        input.close();


    }
}
