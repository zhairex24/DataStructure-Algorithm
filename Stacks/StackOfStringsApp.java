class StackOfStringsApp {
	public static void main(String[]args) {
		StackOfStrings stack = new StackOfStrings();

		stack.push("Shiela");
		stack.push("Andrew");
		stack.push("Jesson");
		stack.push("Angelo");
		stack.push("Rachel");
		stack.push("Lois");
		stack.push("Psypeks");
		stack.push("Jograt");
		stack.push("Kulapo");
		stack.displayInsert();


		System.out.println("Removed " + stack.pop());
		System.out.println("Removed " + stack.pop());
		System.out.println("Removed " + stack.pop());
		stack.displayRemoved();


	}
}