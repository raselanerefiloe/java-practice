class Student{
	//defining fields
	int id;
	String name;

	public static void main(String args[]){
		//Creating an object or instance
		Student s1 = new Student();
		//printing values of the object
		System.out.println(s1.id); //accessing member through reference variable
		System.out.println(s1.name);
	}
}