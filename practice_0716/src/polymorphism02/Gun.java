package polymorphism02;

public class Gun extends Weapon {

	int damage = 100;

	@Override
	public void use() {
		System.out.println("총으로 빵빵 \t" + damage);
	}
	
	
	
	
}
