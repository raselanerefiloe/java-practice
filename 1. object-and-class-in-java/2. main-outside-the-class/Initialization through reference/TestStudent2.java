class Student {
	int id;
	String name;
}

class TestStudent2 {
	public static void main(String args[]){
		Student s1 = new Student();
		s1.id=101;
		s1.name="Refiloe";

		System.out.print(s1.id+" "+s1.name); //printing members with a white space
	}
}