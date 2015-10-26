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
public class SelectionSort extends Sort {
 
    public SelectionSort(int[] numbers) {
        super(numbers);
    }
    
    public void sort() {
        int i,j,index;
        for (i = 0; i < this.numbers.length - 1; i++) {
            index = i;
            for (j = i+1; j < this.numbers.length; j++) {
                if (this.compare(index, j) == index) {
                    this.swap(index, j);
                }
            }
        }
    }
}
