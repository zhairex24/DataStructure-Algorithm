/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 * Parent Class that contains all reusable methods
 * @author Elmer Alvarado
 */
public class Sort {
    protected int numbers[];
    
    public Sort(int[] numbers) {
        this.numbers = numbers;
    }
    
    public int compare(int indexA, int indexB) {
        if (this.numbers[indexA] > this.numbers[indexB]) {
            return indexA;
        } else if (this.numbers[indexA] < this.numbers[indexB]) {
            return indexB;
        } else {
            return -1;
        }
    }
    
    public void swap(int indexA, int indexB) {
        int tmp = this.numbers[indexA];
        this.numbers[indexA] = this.numbers[indexB];
        this.numbers[indexB] = tmp;
    }
    
    public void displayElements() {
        for (int x = 0; x < this.numbers.length; x++) {
            System.out.print(this.numbers[x] + " ");
        }
        System.out.println("\n");
    }
}
