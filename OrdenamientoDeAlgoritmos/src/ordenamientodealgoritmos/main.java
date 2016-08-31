package ordenamientodealgoritmos;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

public class main {

    public static void main(String[] args) {
        Filler filler = new Filler();
        Sort sort = new Sort();
        
        
//		printArray(A, "Original");
//		System.out.println();
        System.out.println("---------------DIEZ------------");
        for (int i = 0; i < 10; i++) {

            int[] A = filler.oneToTen();
            A = filler.shuffle(A);
            long startTime = System.nanoTime();
            sort.bubbleSort(A);
            // sort.selectionSort(A);
            //  sort.insertionSort(A);
            // sort.mergeSort(A);
            //sort.radixSort(A);
            // sort.quickSort(A, 0, A.length - 1);
           //  sort.heapSort(A);
            long endTime = System.nanoTime();
            long estimatedTime = endTime - startTime;

            System.out.println((long) estimatedTime);

        }
        System.out.println("---------------CIEN------------");
        for (int i = 0; i < 10; i++) {
            int[] A = filler.oneToHundred();
            A = filler.shuffle(A);
            long startTime = System.nanoTime();
            sort.bubbleSort(A);
            //  sort.selectionSort(A);
            // sort.insertionSort(A);
            // sort.mergeSort(A);
            // sort.radixSort(A);
            // sort.quickSort(A, 0, A.length - 1);
            // sort.heapSort(A);
            long endTime = System.nanoTime();
            long estimatedTime = endTime - startTime;

            System.out.println((long) estimatedTime);
        }
        System.out.println("---------------MIL------------");
        for (int i = 0; i < 10; i++) {
            int[] A = filler.oneToThousand();
            A = filler.shuffle(A);
            long startTime = System.nanoTime();
             sort.bubbleSort(A);
            // sort.selectionSort(A);
            // sort.insertionSort(A);
            // sort.mergeSort(A);
            //sort.radixSort(A);
            // sort.quickSort(A, 0, A.length - 1);
            // sort.heapSort(A);
            long endTime = System.nanoTime();
            long estimatedTime = endTime - startTime;

            System.out.println((long) estimatedTime);
        }
        System.out.println("---------------DIEZ MIL------------");
        for (int i = 0; i < 10; i++) {
            int[] A = filler.oneToTenThousand();
            A = filler.shuffle(A);
            long startTime = System.nanoTime();
             sort.bubbleSort(A);
            // sort.selectionSort(A);
            // sort.insertionSort(A);
            // sort.mergeSort(A);
            // sort.radixSort(A);
            // sort.quickSort(A, 0, A.length - 1);
            // sort.heapSort(A);
            long endTime = System.nanoTime();
            long estimatedTime = endTime - startTime;
            System.out.println((long) estimatedTime);
        }
        System.out.println("---------------CIEN MILL------------");
        for (int i = 0; i < 10; i++) {
            int[] A = filler.oneToHundredThousand();
            int[] heapArray = A;
            A = filler.shuffle(A);
            long startTime = System.nanoTime();
             sort.bubbleSort(A);
            //sort.selectionSort(A);
            // sort.insertionSort(A);
            // sort.mergeSort(A);
            //  sort.radixSort(A);
            //  sort.quickSort(A, 0, A.length - 1);
            //sort.heapSort(A);
            long endTime = System.nanoTime();
            long estimatedTime = endTime - startTime;

            System.out.println((long) estimatedTime);
        }

        //Heap
//		int[] heapArray = A;
//		for (int i = 0; i < 10; i++) {
//			A = filler.shuffle(A);
//			long startTime = System.nanoTime();
//			for (int j = heapArray.length; j > 1; j--) 
//				heapArray = sort.heapSort(heapArray, j - 1);
//			long endTime = System.nanoTime();
//			System.out.println(endTime - startTime);
//		}
        System.out.println("-------------------------------------");

    }

    public static void printArray(int[] A, String sortName) {
        for (int i = 0; i < A.length; i++) {
            System.out.print("[" + A[i] + "]");
        }
        System.out.println(" -> " + sortName);
    }
}
