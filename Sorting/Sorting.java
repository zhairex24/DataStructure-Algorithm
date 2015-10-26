/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author student
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {10,92,2,30,14,23,1,42,6,20,12};
        Sort sort = new Sort(numbers);
        
        // Bubble Sort
        System.out.println("\n+++++Bubble Sort+++++");
        
        System.out.println("\nElements before Sorting");
        sort.displayElements();
        
        BubbleSort bs = new BubbleSort(numbers);
        bs.sort();
        
        System.out.println("Elements after Sorting");
        sort.displayElements();
        
        // Selection Sort
        System.out.println("\n+++++Selection Sort+++++");
        
        System.out.println("\nElements before Sorting");
        sort.displayElements();
        
        SelectionSort ss = new SelectionSort(numbers);
        ss.sort();
        
        System.out.println("Elements after Sorting");
        sort.displayElements();
        
        // Insertion Sort
        System.out.println("\n+++++Insertion Sort+++++");
        
        System.out.println("\nElements before Sorting");
        sort.displayElements();
        
        InsertionSort is = new InsertionSort(numbers);
        is.sort();
        
        System.out.println("Elements after Sorting");
        sort.displayElements();
    }
    
}
