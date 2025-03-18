import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int angka = input.nextInt();
        int total = 1;

        for(int a = 2; a <= angka; a++) {
            System.out.print(total + " * " + a);
            total *= a;
            System.out.println(" = " + total);
        }   



        input.close();
    }
    
}