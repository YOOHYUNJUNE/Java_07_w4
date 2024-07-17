package polymorphism02;

public class GameExample {
	public static void main(String[] args) {
		
		Warrier faker = new Warrier();
		faker.attack();
		
		System.out.println();
		
		faker.setWeapon(new Gun());
		faker.attack();
		
		System.out.println();
		
		faker.setWeapon(new Bat());
		faker.attack();
		
		
		
	}
}
