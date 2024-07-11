class Animal{
	String color = "White";
}

class Dog extends Animal{
	String color = "Black";

	void printColor(){
		System.out.println(color); // prints color of Dog class
		System.out.println(super.color); //prints color of Animal class

	}
}

class TestSuper1{
	public static void main(String args[]){
		Dog d = new Dog();
		d.printColor();
	}
}