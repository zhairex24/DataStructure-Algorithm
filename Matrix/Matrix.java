/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix;

/**
 *
 * @author El-Angelo
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatrixApp a = new MatrixApp();
        
        a.setCell(0,0,1);
        a.setCell(0,1,2);
        a.setCell(0,2,3);
        a.setCell(0,3,4);
        a.setCell(1,0,1);
        a.setCell(1,1,2);
        a.setCell(1,2,3);
        a.setCell(1,3,4);
        a.setCell(2,0,5);
        a.setCell(2,1,6);
        a.setCell(2,2,3);
        a.setCell(2,3,1);
        a.setCell(2,0,4);
        a.setCell(2,1,3);
        a.setCell(2,2,7);
        a.setCell(2,3,6);
        a.setCell(3,0,6);
        a.setCell(3,1,6);
        a.setCell(3,2,6);
        a.setCell(3,3,6);
        
        
        System.out.println();
        System.out.println("     Matrix A    ");
        System.out.println("--------------------------");
        a.displayMatrix();
        
        MatrixApp b = new MatrixApp();
        
        b.setCell(0,0,1);
        b.setCell(0,1,2);
        b.setCell(0,2,3);
        b.setCell(0,3,4);
        b.setCell(1,0,1);
        b.setCell(1,1,2);
        b.setCell(1,2,3);
        b.setCell(1,3,4);
        b.setCell(2,0,5);
        b.setCell(2,1,6);
        b.setCell(2,2,3);
        b.setCell(2,3,1);
        b.setCell(2,0,4);
        b.setCell(2,1,3);
        b.setCell(2,2,7);
        b.setCell(2,3,6);
        b.setCell(3,0,6);
        b.setCell(3,1,6);
        b.setCell(3,2,6);
        b.setCell(3,3,6);
        
        System.out.println();
        System.out.println("     Matrix B    ");
        System.out.println("--------------------------");
        b.displayMatrix();
        
        MatrixApp sumOfMatrices = new MatrixApp();
        sumOfMatrices.addMatrices(a, b);
        System.out.println();
        System.out.println("     Sum of Matrices    ");
        System.out.println("--------------------------");
        sumOfMatrices.displayMatrix();
        
        
    }
    
}
