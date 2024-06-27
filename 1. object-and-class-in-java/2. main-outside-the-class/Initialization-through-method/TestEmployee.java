class Employee{
	int empId;
	String name;

	void insertRecord(int e, String n){
		empId = e;
		name = n;
	}

	void displayEmpInfo(){System.out.println(empId+" "+name);}
}

class TestEmployee{
	public static void main(String args[]){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.insertRecord(111,"Kana");
		emp2.insertRecord(222, "Refiloe");

		emp1.displayEmpInfo();
		emp2.displayEmpInfo();
	}
}