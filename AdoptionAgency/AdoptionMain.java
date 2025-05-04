/**
 * This class is the Main class for testing the Dog superclass and the PuppyDog subclass
 */
public class AdoptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates a Dog and PuppyDog object
		Dog barkley = new Dog(13, "Barkley", true);
		PuppyDog roxy = new PuppyDog(4, "Roxy", false, true);
		
		//tests out all the methods :3
		System.out.println(barkley.getAdoptionStatus());
		System.out.println(roxy.getAdoptionStatus());
		
		barkley.stateAge();
		roxy.stateAge();
		
		barkley.increaseAge();
		roxy.increaseAge();
		
		barkley.stateAge();
		roxy.stateAge();
		
		System.out.println(barkley);
		System.out.println(roxy);

		//creates two PuppyDog objects with the exact same parameters 
		PuppyDog pupper = new PuppyDog(3, "ca", false, true);
		PuppyDog puppor = new PuppyDog(3, "ca", false, true);
		
		//tests out the equals method 
		System.out.println(pupper.equals(puppor));

	}

}
