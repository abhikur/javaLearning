class Student {
	private String name;
	private String caste;
	public Student(String name, String lastName) {
		this.name = name;
		this.caste = lastName;
	}
	public static void main(String []args) {
		Student person = new Student("Jason","Stathon");
		System.out.println("My name is "+person.name+" "+person.caste);
	}
}