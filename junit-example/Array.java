class Array {
	private int count=0;
	private int[] array;
	
	public void createArray(int size) {
		this.array = new int[size];
	}

	public int[] giveArray() {
		return this.array;
	}

	public int[] push(int num){
		this.array[count++] = num;
		return this.array; 
	}

}