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
public class InsertionSort extends Sort{
    
    public InsertionSort(int[] numbers) {
        super(numbers);
    }
    
    public void sort() {
        int i,j,tmp;
        for (i = 1; i < this.numbers.length; i++) {
            tmp = this.numbers[i];
            j = i;
            while (j>0 && this.numbers[j-1] > tmp) {
                this.numbers[j] = this.numbers[j-1];
                j--;
            } 
            this.numbers[j] = tmp;
        }
    }
}
