/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts.Algoritmos;


/**
 *
 * @author DDiscua
 */
public class MainMILLON {

    public static void main(String[] args) {
       System.out.println("---------------MILLOM------------");
        Filler filler = new Filler();
        Sort sort = new Sort();
        int[] A = filler.oneToMillion();
        for (int i = 0; i < 10; i++) {

            A = filler.shuffle(A);
            long startTime = System.nanoTime();
            //  sort.bubbleSort(A);
            // sort.selectionSort(A);
            // sort.insertionSort(A);
            //sort.mergeSort(A);
            //sort.radixSort(A);
            //sort.quickSort(A, 0, A.length - 1);
              sort.heapSort(A);
            long endTime = System.nanoTime();
            System.out.println(endTime - startTime);

        }

   
    }

}
