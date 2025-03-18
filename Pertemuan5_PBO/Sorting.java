import java.util.Scanner;

public class Sorting {

    public static void BubleSort(int[] array, int jumlah) {
        System.out.println("Buble Sort");
        for(int a = 0 ; a < jumlah ; a++) {
        
            for(int j = 0 ; j < jumlah-1 ; j++) {
                
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }
            
        }

        
    }

    public static void QuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            QuickSort(array, low, pivotIndex - 1);
            QuickSort(array, pivotIndex + 1, high);
            
        }
        
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void InsertionSort(int[] array, int jumlah) {
        System.out.println("Insertion Sort");
        for(int i = 1; i < jumlah; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = temp;
            
        }    
    }

    public static void SelectionSort(int[] array, int jumlah) {
        System.out.println("Selection Sort");
        for(int a = 0; a < jumlah; a++) {
            int min = a;
            for(int b = a+1; b < jumlah; b++) {
                if(array[b] < array[min]) {
                    min = b;
                }   
            }
            int temp = array[min];
            array[min] = array[a];
            array[a] = temp;
        }
    }


    public static void MergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Rekursi untuk membagi menjadi dua bagian
            MergeSort(array, left, mid);
            MergeSort(array, mid + 1, right);

            // Gabungkan dua bagian yang sudah diurutkan
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah data : ");
        int jumlah = input.nextInt();

        int[] array = new int[jumlah];

        for(int a = 0; a < jumlah; a++) {
            System.out.print("Masukan data " + (a+1) + " : ");
            array[a] = input.nextInt();
        }

        BubleSort(array, jumlah);
        for(int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + " ");
        }


        System.out.println();


        System.out.println("Quick Sort");
        QuickSort(array, 0, jumlah - 1);
        for(int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + " ");
        }

        System.out.println();

        InsertionSort(array, jumlah);
        for(int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + " ");
        }

        System.out.println();

        SelectionSort(array, jumlah);
        for(int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + " ");
        }

        System.out.println();

        MergeSort(array, 0, jumlah - 1);
        System.out.println("Merge Sort");
        for(int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + " ");
        }
        
        





        input.close();
    }
}
