import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah data: ");
        int data = input.nextInt();

        int[] array = new int[data];

        for(int a = 0; a < data; a++) {
            System.out.print("Data " + (a+1) + " : ");
            array[a] = input.nextInt();
        }


        for(int b = 0; b < data; b++) {
            System.out.println("Nilai data " + (b+1) + " : " + array[b]);
        }


        input.close();
    }
}
