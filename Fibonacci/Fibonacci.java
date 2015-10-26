public class Fibonacci {

	private int[] F;

	public Fibonacci(int n) {
		F 	 = new int[n];
		F[0] = 0;
		F[1] = 1;
	}

	//set fibonacci by naive method
	public void setFiboNumberByNaive() {
		for ( int n = 2; n < this.F.length; n++ ) {
			this.F[n] = this.F[n-1] + this.F[n-2];
		}
	}

	// set fibonacci by recursion method
	public void setFiboNumberByRecursion() {
		this.setFibo(2);
	}

	// this method was called of setFiboNumberByRecursion to set fibonacci sequence
	private void setFibo(int n) {
		if ( n != this.F.length ) {
			this.F[n] = this.F[n-1] + this.F[n-2];
			this.setFibo(++n);
		}
	}

	// print fibonacci sequence by naive method
	public void printFibonacciByNaive() {
		this.setFiboNumberByNaive();
		IO.printArray(this.F);
	}

	//print fibonacci sequence by recursion method
	public void printFibonacciByRecursion() {
		this.setFiboNumberByRecursion();
		IO.printArray(this.F);
	}

	//return fibonacci numbers as array
	public int[] getFiboNumbers() {
		return this.F;
	}
}