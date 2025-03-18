import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom;

        System.out.print("Masukan baris : ");
        baris = input.nextInt();
        System.out.print("Masukan kolom : ");
        kolom = input.nextInt();


        int[][] array = new int[baris][kolom];
        int[][] array2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        int[][] hasil2 = new int[baris][kolom];


        int count = 0;
        int countB = 0;
        for(int a = 0; a < baris; a++) {
            for(int b = 0; b < kolom; b++) {
                count += 1;
                System.out.print("Masukan nilai " + count + " : ");
                array[a][b] = input.nextInt();
            }
        }

        for(int a = 0; a < baris; a++) {
            for(int b = 0; b < kolom; b++) {
                countB += 1;
                System.out.print("Masukan nilai " + countB + " : ");
                array2[a][b] = input.nextInt();
            }
        }

        System.out.println("Hasil Penjumlahan : ");
        for(int a = 0; a < baris; a++) {
            for(int b = 0; b < kolom; b++) {
                hasil[a][b] = array[a][b] + array2[a][b];
                System.out.print(hasil[a][b] + " ");
            }
            System.out.println();
        }


        int[][] Transfos = new int[kolom][baris];
        if(baris == kolom) {
        System.out.println("Hasil Transfos : ");
        for(int a = 0; a < baris; a++) {
            for(int b = 0; b < kolom; b++) {
                Transfos[b][a] = array[a][b]; 
                //System.out.print(Transfos[a][b] + " ");
            }
            //System.out.println();
        }
            for(int a = 0; a < baris; a++) {
                for(int b = 0;b < kolom; b++) {
                    System.out.print(Transfos[a][b] + " ");
                }
                System.out.println();
            }

        }



        System.out.println("Hasil Perkalian : ");
        for(int a = 0; a < baris; a++) {
            for(int b = 0; b < kolom; b++) {
                hasil2[a][b] = array[a][b] * array2[a][b];
                System.out.print(hasil2[a][b] + " ");
            }
            System.out.println();
        }


        input.close();
    }

    
}
