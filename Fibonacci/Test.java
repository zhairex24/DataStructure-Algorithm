/*
	Name: El-Angelo C. Ferrer
 	Course: BSIS-II
*/

public class Test {
	public static void main(String[] args) {
		int n = 10;
		Fibonacci f = new Fibonacci(n);

		IO.jout("Fibonacci sequence by naive method:", TRUE);
		f.printFibonacciByNaive();

		IO.endl();

		IO.jout("Fibonacci sequence by recursion method:", TRUE);
		f.printFibonacciByRecursion();
	}
}