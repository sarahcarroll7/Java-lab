package oopsexamples1;

public class BirdAndFishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myBird = new Bird();

		myBird.label();
		myBird.move();
		myBird.eat();
		
		Animal myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}

}
