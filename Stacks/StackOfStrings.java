class StackOfStrings {
	private final int SIZE_LIMIT = 10;
	private int counter = 0;
	private String[] names = new String[this.SIZE_LIMIT];

	public StackOfStrings() {
			System.out.println("Created a Stack Data Structure");

	}
	
	// Insert an item in the stack.
	public void push(String name) {
		if (this.isFull()) {
			System.out.println("The stack is Full.");
		} else {
			this.names[this.counter] = name;
			this.counter++;
		}
	}

	// Removes an item from the stack.	
	public	String pop(){
		if (this.isEmpty()) {
			System.out.println("Empty stack");
			return "EMPTY";
		} else {
		String name = this.names[this.counter -1];
			this.names[this.counter - 1] = "";
			this.counter--;
			return name;
		}
	}

	private boolean isFull() {
		if (SIZE_LIMIT == (counter + 1)) {
			return true;
		} else {
			return false;
		}
	}
 
	private boolean isEmpty() {
		if (SIZE_LIMIT == 0){
			return true;
		} else {
			return false;
		}
	}

	public void displayInsert() {
		System.out.println("_________________________");
		System.out.println("The person you enter are:");
		for (int i = 0; i<this.counter; i++){
			System.out.println(this.names[i]);
		}
		System.out.println("-------------------------");
	}

	public void displayRemoved() {
		System.out.println("_________________________");
		System.out.println("The person remaining is/are:");
		for (int i = 0; i<this.counter; i++){
			System.out.println(this.names[i]);
		}

	}

	public int size() {
		return this.counter;
	}
}