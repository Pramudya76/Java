import java.util.Scanner;

public class Baris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int angka = input.nextInt();
        System.out.print("Dipecah : ");
        int pecah = input.nextInt();
        int counter = 1;

        for(int a = 1; counter <= angka; a++) {
            for(int b = 1; b <= pecah && counter <= angka; b++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }





        input.close();
    }
}
