/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patient;

/**
 *
 * @author El-Angelo
 */
public class Patient {
    
/*    protected String firstName;
    protected String lastName;
    protected String address;
    protected int age;
    
    public Patient(String fname, String lname, String addr, int age) {
        this.firstName = fname;
        this.lastName = lname;
        this.address = addr;
        this.age = age;
    }
    
    public String fname() {
        return this.firstName;
    }
    
    public String lname() {
        return this.lastName;
    }
    
    public String address() {
        return this.address;
    }
    
    public int age() {
        return this.age;
    }
  */
    
    private int SIZE = 10;
	private int[] numbers = new int[SIZE];
	public Patient(){}

	public int getSize() {
		return this.SIZE;
	}

	public void setValue(int index, int value) {
		this.numbers[index] = value;
	}
        
        public void showNumbers() {
		for (int i = 0; i < this.SIZE; i++) {
			System.out.print(this.numbers[i] + ", ");
				if (this.numbers[i] == this.numbers[this.SIZE-1]) {
					System.out.print(this.numbers[i]);		
			}
		}
	}
	
	public void sortAscending() {
		int x, y, temp, min_pos;
		for (x = 0; x < this.SIZE; x++) {
			min_pos = x;
			for (y = x + 1; y < this.SIZE; y++) {
				// compare y'th element to min_pos' element
				if (this.numbers[y] < this.numbers[min_pos]) {
					min_pos = y;
				}
			}					
			// SWAP
			temp = this.numbers[min_pos];
			this.numbers[min_pos] = this.numbers[x];
			this.numbers[x] = temp;
		}
	}
}
