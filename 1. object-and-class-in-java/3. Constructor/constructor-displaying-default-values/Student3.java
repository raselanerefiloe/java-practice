class Student3{
	int id;
	String name;

	//Method to display the value of id and name
	void display(){System.out.println(id+" "+name);}


public static void main(String args[]){
	//creating objects
	Student3 s1 = new Student3();
	Student3 s2 = new Student3();

	//Displaying values of the object
	s1.display();
	s2.display();
}
}