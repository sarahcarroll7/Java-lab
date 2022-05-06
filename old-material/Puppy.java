public class Puppy{

	int puppyAge;

	public Puppy(String name){
	System.out.println("Puppy name is: ", + name);
	}

	public void setAge(int Age){
	puppyAge = Age;
	}

	int getAge(){
	System.out.println("The age is: " + PuppyAge);
	}

	public static void main(){

	Puppy mypuppy = new Puppy("Tommy");

	mypuppy.setAge(2);
	mypuppy.getAge();
	}



}
