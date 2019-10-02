
public class Bat extends Mammal{
	public Bat() {
		energy = 300;
	}
	
	public void fly() {
		System.out.println("Time to torment");
		energy -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Munch munch sluuuurrrpppp");
		energy += 25;
	}
	
	public void attackTown() {
		System.out.println("Let it burn!");
		energy -= 100;
	}
}
