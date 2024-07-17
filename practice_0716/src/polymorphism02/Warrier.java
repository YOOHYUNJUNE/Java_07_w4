package polymorphism02;

public class Warrier {
	
	Weapon weapon = new Weapon();
	
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}


	public void attack() {
		weapon.use();
	}
	
	
	
	
	
}
