/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patient;

import java.util.Scanner;

/**
 *
 * @author El-Angelo
 */
public class PatientApp {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		Patient p = new Patient();
		int i, number;
		for (i = 0; i<p.getSize(); i++ ) {
			System.out.printf("Enter the age of the patient/s:", i);
			number = in.nextInt();
			p.setValue(i, number);
		}


		System.out.print("Sort Ascending age of the patients: [");
		p.sortAscending();
		p.showNumbers();
		System.out.println("]");
		System.out.println("");
	}
}
