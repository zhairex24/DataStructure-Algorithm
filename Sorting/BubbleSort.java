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
public class BubbleSort extends Sort{

    public BubbleSort(int[] numbers) {
        super(numbers);
    }
    
    public void sort() {
        int i,j;
        for (i = 0; i < this.numbers.length - 1; i++) {
            for (j = 0; j < this.numbers.length - 1; j++) {
               if ( this.compare(j, j+1) == j ) {
                   this.swap(j, j+1);
               }
            }
        }
    }

}